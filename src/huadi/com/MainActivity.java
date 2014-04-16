package huadi.com;

import huadi.com.Route.BikeOverlay;
import huadi.com.Route.GoogleDirection;
import huadi.com.map.LongPressOverlay;
import huadi.com.map.MyItemizedOverlay;
import huadi.com.map.MyLocationMgr;
import huadi.com.map.MyLocationMgr.LocationCallBack;
import huadi.com.map.SearchSuggestionProvider;
import huadi.com.utils.CommonHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.SearchManager;
import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Vibrator;
import android.provider.SearchRecentSuggestions;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

@SuppressLint("HandlerLeak")
public class MainActivity  extends MapActivity implements LocationCallBack //,OnClickListener
{
	private MapView mapView;
	private MapController mapController;
	private View popView;
	private Drawable myLocationDrawable;
	private Drawable mylongPressDrawable;
	private MyLocationMgr myLocationMgr;
	private MyItemizedOverlay myLocationItemized;//�ڪ���m�h
	MyLocationOverlay myLocationOverlay;
	private MyItemizedOverlay mLongPressItemized; //�����ɶ��h
	private List<Overlay> mapOverlays;
	private OverlayItem overlayitem = null;
	private String query;
	public GeoPoint locPoint; //�j�M�άO��������m
	public GeoPoint myPoint; //�ڪ���m
	
	private BikeOverlay bikeOverlay;
	Drawable pin; //�a�ϤW���v�I��
	
	//����a��---------
	private boolean isRotateMode = false;
	private SensorManager sensorManager;
	private LinearLayout rotateViewLinearLayout;
	private RotateView rotateView;
	//--------------
	
	TextView txtTmer;
	CountDownTimer countDownTimer; //�p�ɾ�
	boolean isTimerRuning = false;
	
	public final int MSG_VIEW_LONGPRESS = 10001;
	public final int MSG_VIEW_ADDRESSNAME = 10002;
	public final int MSG_VIEW_ADDRESSNAME_FAIL = 10004;
	public final int MSG_VIEW_LOCATIONLATLNG = 10003;
	public final int MSG_VIEW_LOCATIONLATLNG_FAIL = 10005;
	
	WakeLock wakeLock;//keep wake up
	
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);        
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        PowerManager pm = (PowerManager)getSystemService(POWER_SERVICE);//����ù��t��
        wakeLock = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "huadi");        
        wakeLock.acquire();
        
        //����a��---------
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		rotateViewLinearLayout = (LinearLayout) findViewById(R.id.rotating_view);
		rotateView = new RotateView(this);
		//-------------------
    	
        myLocationDrawable = getResources().getDrawable(R.drawable.arrow); //�ۤv
        mylongPressDrawable = getResources().getDrawable(R.drawable.dest); //��������m
        
        mapView = (MapView) findViewById(R.id.map_view);
		mapView.setBuiltInZoomControls(true); //����Y����s
		mapView.setClickable(true); //�i�ưʦa��
		
		initPopView();
		mapController = mapView.getController();
		myLocationItemized = new MyItemizedOverlay(myLocationDrawable,this, mapView, popView, mapController);
		mLongPressItemized = new MyItemizedOverlay(mylongPressDrawable,this, mapView, popView, mapController);
		mapOverlays = mapView.getOverlays();
		mapOverlays.add(new LongPressOverlay(this, mapView, mHandler, mapController));
		
		BikeStationPin();
		
		//�H�x�_���F��������
		GeoPoint cityLocPoint = new GeoPoint((int)(25.037642 * 1E6),(int)(121.56377 * 1E6));
		mapController.animateTo(cityLocPoint);
		mapController.setZoom(12);
		MyLocationMgr.init(MainActivity.this.getApplicationContext() , MainActivity.this, myLocationItemized, mapView);
		myLocationMgr = MyLocationMgr.getInstance();
		
		myTimer();

		List<Overlay> overlays = mapView.getOverlays(); //�ۤv����m�h
		myLocationOverlay = new MyLocationOverlay(this, mapView); 
		overlays.add(myLocationOverlay);
		myLocationOverlay.enableCompass(); 
		myLocationOverlay.enableMyLocation(); 

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void initPopView()
    {
    	if(null == popView)
    	{
			popView = getLayoutInflater().inflate(R.layout.overlay_popup, null);
			mapView.addView(popView, new MapView.LayoutParams(
					MapView.LayoutParams.WRAP_CONTENT,
					MapView.LayoutParams.WRAP_CONTENT, null,
					MapView.LayoutParams.BOTTOM_CENTER));
			popView.setVisibility(View.GONE);
    	}
       
    }
    
    public void BikeStationPin()
    {
    	pin = getResources().getDrawable(R.drawable.bike_pin);//�a�ϤW���v�I��
		pin.setBounds(-pin.getMinimumWidth()/2, -pin.getMinimumHeight(), 0, 0);//�H�Ϥ����U�����
		bikeOverlay = new BikeOverlay(pin,MainActivity.this);
		mapOverlays.add(bikeOverlay);
    }    
	
	@Override
	public void onCurrentLocation(Location location) 
	{
		myPoint = new GeoPoint((int) (location.getLatitude() * 1E6),(int) (location.getLongitude() * 1E6));
		//overlayitem = new OverlayItem(myPoint, "�ڪ���m", "");
		mapController.setZoom(16);
//		if(myLocationItemized.size() > 0)
//		{
//			myLocationItemized.removeOverlay(0);
//		}
		//myLocationItemized.addOverlay(overlayitem);
		//mapOverlays.add(myLocationItemized);
		mapController.animateTo(myPoint);
		
		if(locPoint != null)
			BikeDire(myPoint,locPoint);
	}
	
	
	private String getLocationAddress(GeoPoint point)// �q�L�g�n�ױo��a�}
	{
		String add = "";
		Geocoder geoCoder = new Geocoder(getBaseContext(),Locale.getDefault());
		try 
		{
			List<Address> addresses = geoCoder.getFromLocation(
					point.getLatitudeE6() / 1E6, point.getLongitudeE6() / 1E6, 1);
			Address address = addresses.get(0);
			int maxLine = address.getMaxAddressLineIndex();
			if(maxLine >= 2)
			{
				add =  address.getAddressLine(1) + address.getAddressLine(2);
			}
			else 
			{
				add = address.getAddressLine(1);
			}
		} 
		catch (IOException e) 
		{
			add = "";
			e.printStackTrace();
		}
		return add;
	}	
	
	
	private Address searchLocationByName(String addressName)
	{
		Geocoder geoCoder = new Geocoder(getBaseContext(), Locale.TAIWAN);
		try 
		{
			List<Address> addresses = geoCoder.getFromLocationName(addressName, 1);
			Address address_send = null;
			for(Address address : addresses)
			{
				locPoint = new GeoPoint((int)(address.getLatitude() * 1E6), 
						(int)(address.getLongitude() * 1E6));
				address.getAddressLine(1);
				address_send = address;
			}
			return address_send;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	private Handler mHandler = new Handler() 
	{
		@SuppressWarnings("unchecked")
		@Override
		public void handleMessage(Message msg) 
		{
			switch (msg.what) 
			{
				case MSG_VIEW_LONGPRESS: //�������
					if(null == locPoint) return;
					new Thread( new Runnable() 
					{
						@Override
						public void run() 
						{
							String addressName = "";
							
							int count = 0;
							while(true)
							{
								try 
								{
									Thread.sleep(500);
								} 
								catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
								count++;
								addressName = getLocationAddress(locPoint);
								if("".equals(addressName) && count > 5)//5���S�o��a�}�N��F
								{
									Message msg1 = new Message();
									msg1.what = MSG_VIEW_ADDRESSNAME_FAIL;
									mHandler.sendMessage(msg1);
									break;
								}
								else if("".equals(addressName) )
									continue;
								else
									break;								
							}
							if(!"".equals(addressName) || count < 5)
							{
								Message msg = new Message();
								msg.what = MSG_VIEW_ADDRESSNAME;
								msg.obj = addressName;
								mHandler.sendMessage(msg);
							}
						}
					}).start();
					overlayitem = new OverlayItem(locPoint, "��m�W��","���J��...");
					if(mLongPressItemized.size() > 0)
						mLongPressItemized.removeOverlay(0);
					
					popView.setVisibility(View.GONE);
					mLongPressItemized.addOverlay(overlayitem);
					mLongPressItemized.setFocus(overlayitem);
					mapOverlays.add(mLongPressItemized);
					mapController.animateTo(locPoint);
					mapView.invalidate();
					break;
					
				case MSG_VIEW_ADDRESSNAME:	//�o��a�}����ܦb�u���ؤW		
					TextView desc = (TextView) popView.findViewById(R.id.map_bubbleText);
					desc.setText((String)msg.obj);
					popView.setVisibility(View.VISIBLE);
					break;
					
				case MSG_VIEW_ADDRESSNAME_FAIL: //�o����a�}�W��
					TextView desc1 = (TextView) popView.findViewById(R.id.map_bubbleText);
					desc1.setText("�L�k�o��m");
					popView.setVisibility(View.VISIBLE);
					break;
					
				case MSG_VIEW_LOCATIONLATLNG:
					CommonHelper.closeProgress();
					Address address = (Address)msg.obj;
					locPoint = new GeoPoint((int)(address.getLatitude() * 1E6), (int)(address.getLongitude() * 1E6));
					overlayitem = new OverlayItem(locPoint, address.getAddressLine(1),address.getAddressLine(0));
					if(mLongPressItemized.size() > 0){
						mLongPressItemized.removeOverlay(0);
					}
					
					BikeDire(myPoint,locPoint);//�e���u��ت��a
					
					popView.setVisibility(View.GONE);
					mLongPressItemized.addOverlay(overlayitem);
					mLongPressItemized.setFocus(overlayitem);
					mapOverlays.add(mLongPressItemized);
					mapController.animateTo(locPoint);
					mapView.invalidate();
					break;
					
				case MSG_VIEW_LOCATIONLATLNG_FAIL:
					CommonHelper.closeProgress();
					Toast.makeText(MainActivity.this, "�j�M����", Toast.LENGTH_SHORT).show();
					break;
			}
		}
	};
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
	    // Handle item selection
	    switch (item.getItemId()) 
	    {
	    	case R.id.menu_search://�j�M
	    		onSearchRequested();
	    		return true;
	    	case R.id.menu_loction://����a��
	    		RotateMap(isRotateMode);
	    		return true;
	    	case R.id.menu_nearbike://�̪��I
	    		try
				{
					GeoPoint minPoint = BikeOverlay.minDistience(myPoint);//�̪񪺯��I
					new GoogleDirection(myLocationOverlay, mapView).execute(
							myPoint.getLatitudeE6()/1E6 + "," + myPoint.getLongitudeE6()/1E6,
							minPoint.getLatitudeE6()/1E6 + "," + minPoint.getLongitudeE6()/1E6);
				}
				catch (Exception e)
				{
					Toast.makeText(this, "No location found", Toast.LENGTH_LONG).show();
				}
	    		return true;
	    	case R.id.menu_timer://�p�ɾ�
	    		if(isTimerRuning)
				{
					countDownTimer.cancel();
					txtTmer.setText("00:00");
					isTimerRuning =! isTimerRuning;
				}
				else 
				{
					countDownTimer.start();
					isTimerRuning =! isTimerRuning;
				}
	    		return true;
	    		
	    	case R.id.menu_about:
	    		new AlertDialog.Builder(this)
	    		.setTitle("����")
	    		.setMessage("huadi73@gmail.com")
	    		.show();
	    		return true;
	    	default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void BikeDire(GeoPoint from, GeoPoint dest) //���u�W��
	{
		List<GeoPoint> route = new ArrayList<GeoPoint>();
		String ways = "";
		route = BikeOverlay.WayStation(from, dest, BikeOverlay.GetItems(), route);
		
		Log.v("0", "" + route.size());
		
		if(route.size() > 0)
		{
			if(route.size() > 1) // "7C" �O "|" ��16�i��A�]url�S��r�����D�A�[�r���ܬO�[ "%"
				for(int i = 1 ; i < route.size(); i++)
					ways += "%7C" + route.get(i).getLatitudeE6()/ 1E6 + "," + route.get(i).getLongitudeE6()/ 1E6;
			
			new GoogleDirection(myLocationOverlay, mapView).execute(
					from.getLatitudeE6()/1E6+","+from.getLongitudeE6()/1E6,
					dest.getLatitudeE6()/1E6+","+dest.getLongitudeE6()/1E6+
					"&waypoints=" + route.get(0).getLatitudeE6()/ 1E6 + "," + route.get(0).getLongitudeE6()/ 1E6+
					ways);
		}
		else 
		{
			new GoogleDirection(myLocationOverlay, mapView).execute(
					from.getLatitudeE6()/1E6+","+from.getLongitudeE6()/1E6,
					dest.getLatitudeE6()/1E6+","+dest.getLongitudeE6()/1E6);
		}
	}
	
	private void myTimer()//�p�ɾ�
	{
		countDownTimer = new CountDownTimer(30*60*1000, 1000)//�p��30�����_�ʴ���
    	{
    		Vibrator myVibrator = (Vibrator) getApplication().getSystemService(Service.VIBRATOR_SERVICE);//���o�_�ʪA��
    		public void onTick(long millisUntilFinished) 
    		{
    			txtTmer = (TextView)findViewById(R.id.txtTimer);
    			txtTmer.setText( millisUntilFinished / 1000 / 60 + ":" + (millisUntilFinished / 1000) % 60);
    			if(millisUntilFinished / 1000 / 60 == 5)
    			{
    				myVibrator.vibrate(3000);
    				Toast.makeText(MainActivity.this, "Remaining 5 min", Toast.LENGTH_LONG).show();
    			}    				
    		}
    		public void onFinish() 
    		{
    			txtTmer.setText("00:00");
    			myVibrator.vibrate(3000);
    			Toast.makeText(MainActivity.this, "Time's up", Toast.LENGTH_LONG).show();
    		}
    	};
	}
	
	@SuppressWarnings("deprecation")
	private void RotateMap(boolean compassMode)//����a��
	{
		if (compassMode)
		{
			sensorManager.unregisterListener(rotateView);
			rotateView.removeAllViews();
			rotateViewLinearLayout.removeAllViews();
			rotateViewLinearLayout.addView(mapView);
			mapView.setClickable(true);
			//myLocationOverlay.disableCompass();
			isRotateMode = false;
		}
		else
		{
			rotateViewLinearLayout.removeAllViews();
			rotateView.removeAllViews();
			rotateView.addView(mapView);
			rotateViewLinearLayout.addView(rotateView);
			mapView.setClickable(false);
			sensorManager.registerListener(rotateView,
					SensorManager.SENSOR_ORIENTATION,
					SensorManager.SENSOR_DELAY_UI);
			//myLocationOverlay.enableCompass();
			isRotateMode = true;
		}
	}
	
	@Override
	public boolean onSearchRequested(){ //���}�j�M��   
		startSearch(null, false, null, false);
		return true;
	}

	
	@Override
	public void onNewIntent(Intent intent)//�o��j�M���G
	{
		super.onNewIntent(intent);
		
		query = intent.getStringExtra(SearchManager.QUERY);//��o�j�M�ظ̪���
		//�O�s�j�M�O��
		SearchRecentSuggestions suggestions=new SearchRecentSuggestions(this,
				SearchSuggestionProvider.AUTHORITY, SearchSuggestionProvider.MODE);
		suggestions.saveRecentQuery(query, null);
		
		CommonHelper.showProgress(this, "���b�j�M: " + query);
		new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				Address address;
				int count = 0;
				while(true)
				{
					count++;
					try 
					{
						Thread.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					address = searchLocationByName(query);
					
					if(address == null && count > 5) //�j�M����ζW�L5�� �N�����ѤF
					{
						Message msg1 = new Message();
						msg1.what = MSG_VIEW_LOCATIONLATLNG_FAIL;
						mHandler.sendMessage(msg1);
						break;
					}
					else if(address == null)
						continue;
					else
						break;
				}
				
				if( address != null || count <= 5 )
				{
					Message msg = new Message();
					msg.what = MSG_VIEW_LOCATIONLATLNG;
					msg.obj = address;
					mHandler.sendMessage(msg);
				}
			}
		}).start();
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
	    if (keyCode == KeyEvent.KEYCODE_BACK) //�� Back �� Home�@�˪��ĪG
	    {
	        moveTaskToBack(true); //�I������
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public void onResume()
	{
		super.onResume();
		wakeLock.acquire();
		
		MyLocationMgr.init(MainActivity.this.getApplicationContext() , MainActivity.this, myLocationItemized, mapView);
		myLocationMgr = MyLocationMgr.getInstance();
		myLocationOverlay.enableMyLocation(); 
		
		if(myPoint != null)
			mapController.animateTo(myPoint);
	}

	@Override
	public void onPause()
	{
		super.onPause();
		wakeLock.release();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState)
	{
		// Save instance-specific state
		super.onSaveInstanceState(outState);
		// remember the compass mode state
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onStop()
	{
		sensorManager.unregisterListener(rotateView);
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
//		myLocationMgr.destoryLocationManager();
		wakeLock.release();
	}
	
	@Override //�~�� MapActivity ���ݹ�@ isRouteDisplayed ��k
	protected boolean isRouteDisplayed() {
		return false;
	}
}
