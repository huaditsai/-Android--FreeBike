package huadi.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.ImageView;

public class StartActivity extends Activity
{
	private Handler handler = new Handler();
	ImageView imageView;
	int introImage[] = { R.drawable.intro_1, R.drawable.intro_2, R.drawable.intro_3, R.drawable.intro_4 }; //功能介紹圖們
	int introId = 0;
	

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.start);
		
		SharedPreferences settings = getSharedPreferences("Preference", 0);
		if( settings.contains("isknow")) //如果已經看過功能介紹
		{
			Intent intent = new Intent(StartActivity.this,MainActivity.class);
			startActivity(intent);
			finish();
		}
		else 
		{
			new AlertDialog.Builder(this)
			.setTitle("進入介紹頁面")
    		.setMessage("約5-10秒")
    		.setPositiveButton("確定", new OnClickListener()
			{
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
					imageView = (ImageView) findViewById(R.id.imageView1);
					
			        handler.removeCallbacks(updateTimer);
			        handler.postDelayed(updateTimer, 3000); // 3sec
				}
			})
			.setNegativeButton("取消", new OnClickListener()
			{
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
					SharedPreferences settings = getSharedPreferences("Preference", 0);
					settings.edit().putBoolean("isknow", true).commit(); //寫入已經看過功能介紹
					
					Intent intent = new Intent(StartActivity.this,MainActivity.class);
					startActivity(intent);
					finish();
				}
			})
    		.show();
			
			
		}		
	}
	

    private Runnable updateTimer = new Runnable() 
    {
        public void run() 
        {
        	if (introId < introImage.length)
			{
				imageView.setImageResource(introImage[introId]);
				introId++;
				handler.postDelayed(this, 3000); // 3sec
			}
			else
			{				
				SharedPreferences settings = getSharedPreferences("Preference", 0);
				settings.edit().putBoolean("isknow", true).commit(); //寫入已經看過功能介紹
				
				Intent intent = new Intent(StartActivity.this,MainActivity.class);
				startActivity(intent);
				handler.removeCallbacks(updateTimer);//Stop
				finish();
			}
            
        }
    };
    
    
}