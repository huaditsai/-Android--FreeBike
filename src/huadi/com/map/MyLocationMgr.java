package huadi.com.map;

import com.google.android.maps.MapView;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class MyLocationMgr
{
	private static Context mContext;
	private LocationManager gpsLocationManager;
	private LocationManager networkLocationManager;
	private static final int MINTIME = 2000;
	private static final int MININSTANCE = 2;
	private static MyLocationMgr instance;
	private Location lastLocation = null;
	private static LocationCallBack mCallback;
	
	static MyItemizedOverlay mlayer;
	static MapView mview;
	
	public static void init(Context c , LocationCallBack callback, MyItemizedOverlay layer, MapView view) 
	{
		mContext = c;
		mCallback = callback;
		
		mview = view;
		mlayer = layer;
	}

	
	private MyLocationMgr() 
	{
		// Gps �w��
		gpsLocationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
		//Location gpsLocation = gpsLocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		gpsLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,MINTIME, MININSTANCE, locationListener);
        
		// �����w��
		networkLocationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
		//Location networkLocation = gpsLocationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
		networkLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MINTIME, MININSTANCE,locationListener);
	}

	public static MyLocationMgr getInstance() 
	{
		if (null == instance) 
		{
			instance = new MyLocationMgr();
		}
		return instance;
	}

	private void updateLocation(Location location) 
	{
		lastLocation = location;
		mCallback.onCurrentLocation(location);
	}

	
	private final LocationListener locationListener = new LocationListener() 
	{
		@Override //��GPS�κ������A����
		public void onStatusChanged(String provider, int status, Bundle extras) {
		}

		@Override //��GPS�κ����}��
		public void onProviderEnabled(String provider) {
		}

		@Override //��GPS�κ�������
		public void onProviderDisabled(String provider) {
		}

		@Override //��a�I����
		public void onLocationChanged(Location location) 
		{
			updateLocation(location);
		}
	};

	public Location getMyLocation() {
		return lastLocation;
	}
	
	
	public interface LocationCallBack{
		void onCurrentLocation(Location location);
	}
	
	
	public void destoryLocationManager()
	{
		gpsLocationManager.removeUpdates(locationListener);
		networkLocationManager.removeUpdates(locationListener);
	}
}
