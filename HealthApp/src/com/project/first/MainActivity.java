package com.project.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.project.first.parser.ConnectionDetector;

public class MainActivity extends Activity implements OnItemClickListener {

	ListView fitbitlist;
	ConnectionDetector cd;
	Boolean isInternetPresent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fitbitlist = (ListView)findViewById(R.id.list_fitbit);
		cd = new ConnectionDetector(getApplicationContext());
		fitbitlist.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		isInternetPresent = cd.isConnectingToInternet();
		if (isInternetPresent) {
			String item = fitbitlist.getItemAtPosition(position).toString();
			//Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
			if(item.equalsIgnoreCase("Diet Plan"))
			{
				Intent callintent = new Intent(this, DietActivity.class);
				startActivity(callintent);
			}
			else if(item.equalsIgnoreCase("Orthopedic Plan"))
			{
				Intent callintent = new Intent(this, OrthopedicActivity.class);
				startActivity(callintent);
			}
			else
			{
				Intent callintent = new Intent(this, CallActivity.class);
				callintent.putExtra("itemvalue", item);
				startActivity(callintent);
			}
		}else {
	        // Internet connection is not present
	        // Ask user to connect to Internet
	        Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show();
	    }
	}

}