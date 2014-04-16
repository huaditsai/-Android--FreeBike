package huadi.com.Route;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.R.integer;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class RealTimeBike extends AsyncTask<String, String, String> // <傳入參數, 處理中更新介面參數, 處理後傳出參數>
{
	// private final String bikeurl =
	// "http://its.taipei.gov.tw/aspx/Youbike.aspx?Mode=1"; //台北市交通局5分鐘更新(舊)
	String info = "";

	Transform trans = new Transform();

	String mitems; // 按下的圖標
	Context mcontext;

	public RealTimeBike(String items, Context context)
	{
		mitems = items;
		mcontext = context;
	}

	@Override
	protected String doInBackground(String... params)
	{
		if (params.length < 0)
			return null;

		HttpURLConnection con = null;
		try
		{
			URL url = new URL("http://www.youbike.com.tw/info3b.php?sno=" + params[0]); // String.format("%04d",));
			Log.e("Exception", params[0]);
			con = (HttpURLConnection) url.openConnection();
			con.setReadTimeout(10000);
			con.setConnectTimeout(15000);
			con.setRequestMethod("GET");
			con.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.2; en-GB; rv:1.9.2.9) Gecko/20100824 Firefox/3.6.9");
			con.setDoInput(true);
			con.connect();

			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			String n, result = "";
			StringBuilder htmlContent = new StringBuilder();
			while ((n = reader.readLine()) != null)
				htmlContent.append(n);

			result = htmlContent.toString();

			String pattern;
			pattern = "sbi\\s*\\=\\s*'([0-9]+)?'.*sus\\s*\\=\\s*'([0-9]+)?';";
			Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
			Matcher m = p.matcher(result);
			while (m.find())
			{
				int total = Integer.parseInt(m.group(1)) + Integer.parseInt(m.group(2));
				info = m.group(1) + " / " + total;
			}
		}
		catch (Exception e)
		{
			Log.e("Exception", e.toString());
			info = "測試或維修中...";
		}
		finally
		{
			if (con != null)
				con.disconnect();
		}

		return info;
	}

	@Override
	protected void onPostExecute(String result)
	{
		super.onPostExecute(result);

		Toast.makeText(mcontext, "這裡是 " + mitems + "\r\n可借車輛 " + result, Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onProgressUpdate(String... params)
	{
		super.onProgressUpdate(params);
	}
}
