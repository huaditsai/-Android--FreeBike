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
	int introImage[] = { R.drawable.intro_1, R.drawable.intro_2, R.drawable.intro_3, R.drawable.intro_4 }; //�\�श�йϭ�
	int introId = 0;
	

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.start);
		
		SharedPreferences settings = getSharedPreferences("Preference", 0);
		if( settings.contains("isknow")) //�p�G�w�g�ݹL�\�श��
		{
			Intent intent = new Intent(StartActivity.this,MainActivity.class);
			startActivity(intent);
			finish();
		}
		else 
		{
			new AlertDialog.Builder(this)
			.setTitle("�i�J���Э���")
    		.setMessage("��5-10��")
    		.setPositiveButton("�T�w", new OnClickListener()
			{
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
					imageView = (ImageView) findViewById(R.id.imageView1);
					
			        handler.removeCallbacks(updateTimer);
			        handler.postDelayed(updateTimer, 3000); // 3sec
				}
			})
			.setNegativeButton("����", new OnClickListener()
			{
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
					SharedPreferences settings = getSharedPreferences("Preference", 0);
					settings.edit().putBoolean("isknow", true).commit(); //�g�J�w�g�ݹL�\�श��
					
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
				settings.edit().putBoolean("isknow", true).commit(); //�g�J�w�g�ݹL�\�श��
				
				Intent intent = new Intent(StartActivity.this,MainActivity.class);
				startActivity(intent);
				handler.removeCallbacks(updateTimer);//Stop
				finish();
			}
            
        }
    };
    
    
}