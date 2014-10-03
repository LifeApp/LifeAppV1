package com.lifeappv1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Button functionality
		Button scriptsButton = (Button) findViewById(R.id.main_scripts_button);
		Button timeButton = (Button) findViewById(R.id.main_time_button);
		Button relationshipButton = (Button) findViewById(R.id.main_relationship_button);
		Button hygieneButton = (Button) findViewById(R.id.main_hygiene_button);
		Button emergencyButton = (Button) findViewById(R.id.main_emergency_button);
		
		//Listeners
		scriptsButton.setOnClickListener(this);
		timeButton.setOnClickListener(this);
		relationshipButton.setOnClickListener(this);
		hygieneButton.setOnClickListener(this);
		emergencyButton.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View theView)
	{
		switch(theView.getId())
		{
		case R.id.main_scripts_button:
			//Open new view
			break;
		case R.id.main_time_button:
			//Open new view
			break;
		case R.id.main_relationship_button:
			//Open new view
			break;
		case R.id.main_hygiene_button:
			//Open new view
			break;
		case R.id.main_emergency_button:
			//Open new view
			break;					
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
