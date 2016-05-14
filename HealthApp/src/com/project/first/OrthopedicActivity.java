package com.project.first;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;

public class OrthopedicActivity extends Activity implements OnItemSelectedListener {

	Spinner orthopedispinner;
	TextView orthopedictv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orthopedic);
		orthopedispinner = (Spinner)findViewById(R.id.spinner_orthopedic);
		orthopedictv = (TextView)findViewById(R.id.textView_orthopedic);
		orthopedispinner.setOnItemSelectedListener(this);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// app icon in action bar clicked; go home
			Intent intent = new Intent(this, MainActivity.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
			long arg3) {
		switch (pos) {
		case 1:
			orthopedictv.setText(Html.fromHtml("<body><h1>Age group:<h1><br>" +
					"<p>Below 12 years</p><br>" +
					"<h1>Why Attention Required:</h1><br>" +
					"<p>In this age, child grows rapidly and hence " +
					"his bone mass increases significantly. Thus, " +
					"bones need extra strength in this cohort.</p><br>" +
					"<h1>Recommendations:</h1><br>" +
					"<p>Intake of Calcium and vitamin D.</p><br>" +
					"<h3>Sources:</h3><br>" +
					"Egg Yolk, Milk, Exposure to sun enables " +
					"body to make its own Vitamin D, Cod liver Oil, " +
					"seeds, lemongrass, sprouts, avocado, garlic, " +
					"Milk, yoghurt, cheese, almonds, cereals, all milk " +
					"products, green leafy vegetables (spinach),fish oil.</body>"));
			break;
		case 2:
			orthopedictv.setText(Html.fromHtml("<body><h1>Age group:<h1><br>" +
					"<p>Between 12 to 18 Years.</p><br>" +
					"<h1>Why Attention Required:</h1><br>" +
					"<p>In this age, child attains puberty which " +
					"has a key role in the development of skeleton." +
					"During puberty onset, child loses body calcium. " +
					"Thus, he/she needs special diet to overcome this problem.</p><br>" +
					"<h1>Recommendations:</h1><br>" +
					"<p>Intake of Calcium and vitamin D.</p><br>" +
					"<h3>Exercises:</h3><br>" +
					"<p>Weight bearing exercise like walking and " +
					"running, as well as team sports like soccer " +
					"and basketball.</p><br>" +
					"<h3>Sources:</h3><br>" +
					"Egg Yolk, Milk, Exposure to sun enables " +
					"body to make its own Vitamin D, Cod liver Oil, " +
					"seeds, lemongrass, sprouts, avocado, garlic, " +
					"Milk, yoghurt, cheese, almonds, cereals, all milk " +
					"products, green leafy vegetables (spinach),fish oil.</body>"));
			break;
		case 3:
			orthopedictv.setText(Html.fromHtml("<body><h1>Age group:<h1><br>" +
					"<p>Between 19 to 30 Years.</p><br>" +
					"<h1>Why Attention Required:</h1><br>" +
					"<p>In this age, it is essential to maintain the bone health." +
					" Though there is no new bone formation, it is difficult to" +
					" maintain the bone mass already formed till now.  Thus, it requires " +
					"some exercises along with the nutritional diet.</p><br>" +
					"<h1>Recommendations:</h1><br>" +
					"<p>Opt for supplements of calcium and vitamin D with healthy diet.</p><br>" +
					"<h3>Exercises:</h3><br>" +
					"<p>At least 30 minutes of weight bearing activity (brisk walk), Muscle " +
					"strengthening push-ups, sit-ups, lunges, squats, lifting weights etc.</p><br></body>"));
			break;
		case 4:
			orthopedictv.setText(Html.fromHtml("<body><h1>Age group:<h1><br>" +
					"<p>Between 31 to 51 Years.</p><br>" +
					"<h1>Why Attention Required:</h1><br>" +
					"<p>In this age, bone mass is gradually reduced, for which " +
					"exercises and essential nutrients are must to preserve the " +
					"bone health.</p><br>" +
					"<h1>Recommendations:</h1><br>" +
					"<p>Opt for supplements of calcium and " +
					"vitamin D with healthy diet.</p><br>" +
					"<h3>Exercises:</h3><br>" +
					"<p>At least 30 minute walk and 15 min jogging.</p><br>" +
					"<h3>Sources:</h3><br>" +
					"Egg Yolk, Milk, Exposure to sun enables " +
					"body to make its own Vitamin D, Cod liver Oil, " +
					"seeds, lemongrass, sprouts, avocado, garlic, " +
					"Milk, yoghurt, cheese, almonds, cereals, all milk " +
					"products, green leafy vegetables (spinach),fish oil.</body>"));
			break;
		case 5:
			orthopedictv.setText(Html.fromHtml("<body><h1>Age group:<h1><br>" +
					"<p>Above 50 years</p><br>" +
					"<h1>Why Attention Required:</h1><br>" +
					"<p>In this age, people get some endocrinal disorders. " +
					"Therefore, body loses calcium rapidly, Thus, person needs " +
					"some calcium supplements along with the regular diet and " +
					"do some light exercises.</p><br>" +
					"<h1>Recommendations:</h1><br>" +
					"<p>Opt for supplements of calcium and vitamin D with healthy diet.</p><br>"+
					"<h3>Exercises:</h3><br>" +
					"<p>15 min walk with yoga and meditation.</p><br>" +
					"<h3>Sources:</h3><br>" +
					"Egg Yolk, Milk, Exposure to sun enables " +
					"body to make its own Vitamin D, Cod liver Oil, " +
					"seeds, lemongrass, sprouts, avocado, garlic, " +
					"Milk, yoghurt, cheese, almonds, cereals, all milk " +
					"products, green leafy vegetables (spinach),fish oil.</body>"));
			break;

		default:
			break;
		}
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
