package huadi.com.Route;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.util.Log;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class GoogleDirection extends AsyncTask<String, Integer, List<GeoPoint>>
{
	private final String mapAPI = 
		"http://maps.google.com/maps/api/directions/json?" //Google Directions API
		+ "origin={0}&destination={1}&language=zh-TW&sensor=true&mode=walking";
	
	private String from;
	private String desti;
	private List<GeoPoint> geoPoints = new ArrayList<GeoPoint>();

	MyLocationOverlay mylayer;
	MapView mapView;
	
	public GoogleDirection(MyLocationOverlay layer, MapView view)
	{
		mylayer = layer;
		mapView = view;
	}
	
	@Override
	protected List<GeoPoint> doInBackground(String... params)
	{
		if (params.length < 0)
			return null;

		from = params[0];
		desti = params[1];

		String url = MessageFormat.format(mapAPI, from, desti);
		//Log.i("map", url);
		HttpGet get = new HttpGet(url);
		String strResult = "";
		
		try
		{
			HttpParams httpParameters = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(httpParameters, 3000);
			HttpClient httpClient = new DefaultHttpClient(httpParameters);

			HttpResponse httpResponse = null;
			httpResponse = httpClient.execute(get);

			if (httpResponse.getStatusLine().getStatusCode() == 200)//�P�_�����s���O�_���\
			{
				strResult = EntityUtils.toString(httpResponse.getEntity());				
				//Log.e("strResult", strResult);
				
				JSONObject jsonObject = new JSONObject(strResult);
				JSONArray routeObject = jsonObject.getJSONArray("routes");//route �|���X��W�����u (�Ҧp�uUS 101�v)
				String polyline = routeObject.getJSONObject(0).getJSONObject("overview_polyline").getString("points");

				if (polyline.length() > 0)
				{
					DecodePolylines(polyline);
				}
			}
		}
		catch (Exception e)
		{
			Log.e("map", e.toString());
		}
		
		return geoPoints;
	}

	//https://developers.google.com/maps/documentation/utilities/polylinealgorithm?hl=zh-TW
	private void DecodePolylines(String poly)//�������o�� myywCkv~dVQzSIlDA~DEvIMlPAvAf@@ ���F��ѽX
	{
		int len = poly.length();
		int index = 0;
		int lat = 0;//�n��
		int lng = 0;//�g��

		while (index < len)
		{
			int b, shift = 0, result = 0;
			do
			{
				b = poly.charAt(index++) - 63;
				result |= (b & 0x1f) << shift; //�ର2�i�� �B �C 5 �Ӧ줸�����@�Ӱ϶�,�e�ᶶ�Ǥ]���K�A�ˤF
				shift += 5; //�C 5 �Ӧ줸�����@�Ӱ϶�
			} while (b >= 0x20); //0x20 ��2�i��=100000
			
			int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1)); //�V�k���@�줸,1���ɼ�(1,0�ۤ�)
			lat += dlat;

			shift = 0;
			result = 0;
			
			do
			{
				b = poly.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			
			int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lng += dlng;

			GeoPoint p = new GeoPoint((int) (((double) lat / 1E5) * 1E6), (int) (((double) lng / 1E5) * 1E6));
			geoPoints.add(p);
		}
	}

	protected void onPostExecute(List<GeoPoint> points)
	{
		if (points.size() > 0)
		{
			DrawRouteOverlay drawRoute = new DrawRouteOverlay(points);

			List<Overlay> overlays = mapView.getOverlays();
			
			//overlays.clear();
			overlays.remove(0);
			
			overlays.add(mylayer);
			overlays.add(0, drawRoute);
		}
	}

}
