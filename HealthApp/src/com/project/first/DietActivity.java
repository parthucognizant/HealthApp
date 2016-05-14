package com.project.first;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;

public class DietActivity extends Activity implements OnItemSelectedListener {

	Spinner dietlist;
	TextView dietdetails;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diet);
		dietlist = (Spinner)findViewById(R.id.spinner_Diet);
		dietdetails = (TextView)findViewById(R.id.tvDiettDetails);
		dietlist.setOnItemSelectedListener(this);
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
	
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
			long arg3) {
		// TODO Auto-generated method stub
		/*String item = Integer.toHexString(pos);//dietlist.getItemAtPosition(pos).toString();
		Toast.makeText(this, item, Toast.LENGTH_SHORT).show();*/
		switch (pos) {
		case 1: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin A,Vitamin E\n\n\n " +
					"Dietary Sources:\n\n Vitamin A:\nLiver ,carrots, dairy " +
					"foods, sweet potato, pumpkin, mangoes, spinach, Papaya, " +
					"beet root, fish oil \nVitamin E:\nCorn, Butter, Brown Rice, " +
					"Soybean Oil, Vegetable oils such as Corn, Cottonseed or " +
					"Soybean, Nuts, Wheat, All kind of berries, sprouts, fish oil");
			break;
		case 2: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin A\n\n\n " +
					"Dietary Sources:\n\n Liver ,carrots, dairy " +
					"foods, sweet potato, pumpkin, mangoes, spinach," +
					" Papaya, beet root, fish oil");
			break;
		case 3: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin A,Vitamin E,Minerals\n\n\n " +
					"Dietary Sources:\n\n Vitamin A:\n" +
					"Liver ,carrots, dairy foods, sweet " +
					"potato, pumpkin, mangoes, spinach, Papaya, " +
					"beet root, fish oil \nVitamin B:\nSunflower " +
					"Seeds, Pork, whole and enriched Grains, " +
					"dried Beans, kelp, dates, garlic, parsley, " +
					"watercress, wheatgrass\nMinerals:\nFruits( banana, pomegranate) " +
					"and green leafy vegetables");
			break;
		case 4: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin A, Vitamin C\n\n\n " +
					"Dietary Sources:\n\n Vitamin A:\nLiver" +
					" ,carrots, dairy foods, sweet potato, pumpkin," +
					" mangoes, spinach, Papaya, beet root, fish oil\n" +
					"Vitamin C:\nCitrus Fruits, Strawberries, Broccoli, " +
					"Green Peppers, Orange, Meat");
			break;

		case 5: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin A\n\n\n " +
					"Dietary Sources:\n\n Liver ,carrots, dairy foods, " +
					"sweet potato, pumpkin, mangoes, " +
					"spinach, Papaya, beet root, fish oil");
			break;
		case 6: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin A,Vitamin D\n\n\n " +
					"Dietary Sources:\n\n Vitamin A :\n" +
					"Liver ,carrots, dairy foods, sweet potato," +
					" pumpkin, mangoes, spinach, Papaya, beet root, " +
					"fish oil\nVitamin D:\nEgg Yolk, Milk, Exposure " +
					"to sun enables body to make its own Vitamin D, " +
					"Cod liver Oil, seeds, lemongrass, sprouts, avocado, " +
					"garlic, greens leafyVegetables(spinach),fish oil");
			break;
		case 7: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin C,Vitamin D\n\n\n " +
					"Dietary Sources:\n\n Vitamin C:\n" +
					"Citrus Fruits, Strawberries, Broccoli," +
					" Green Peppers, Orange, Meat\nVitamin D:" +
					"\nEgg Yolk, Milk, Exposure to sun enables body" +
					" to make its own Vitamin D, Cod liver Oil, seeds, " +
					"lemongrass, sprouts, avocado, garlic, greens " +
					"leafyVegetables(spinach),fish oil");
			break;
		case 8: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin B\n\n\n " +
					"Dietary Sources:\n\n Sunflower Seeds, Pork, whole " +
					"and enriched " +
					"Grains, dried Beans, kelp, dates, garlic, parsley, " +
					"watercress, wheatgrass");
			break;
		case 9: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin B,Calcium\n\n\n " +
					"Dietary Sources:\n\n Vitamin B:\nSunflower Seeds, Pork, whole " +
					"and enriched " +
					"Grains, dried Beans, kelp, dates, garlic, parsley, " +
					"watercress, wheatgrass\nCalcium:\nMilk, " +
					"yoghurt, cheese, almonds, " +
					"cereals, all milk products");
			break;
		case 10: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin B\n\n\n " +
					"Dietary Sources:\n\n Sunflower Seeds, Pork, whole " +
					"and enriched " +
					"Grains, dried Beans, kelp, dates, garlic, parsley, " +
					"watercress, wheatgrass");
			break;
		case 11: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin C, Iron\n\n\n " +
					"Dietary Sources:\n\n Vitamin C:\n" +
					"Citrus Fruits, Strawberries, Broccoli, " +
					"Green Peppers, Orange, Meat\nIron:\nGreen " +
					"Leafy vegetables, Liver,  Meats, Kidney beans, " +
					"enriched Bread, Raisins., sprouts, almonds, apricot," +
					" beets, cherries, dates, figs, grains, lentils , parsley, " +
					"pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 12: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin C\n\n\n " +
					"Dietary Sources:\n\n Citrus Fruits, Strawberries, Broccoli," +
					" Green Peppers, Orange, Meat");
			break;
		case 13: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin D\n\n\n " +
					"Dietary Sources:\n\n Egg Yolk, Milk, Exposure to sun en" +
					"ables body to make its own Vitamin D, Cod liver Oil, seeds, " +
					"lemongrass, sprouts, avocado, garlic, greens leafyVegetables(spinach),fish oil");
			break;
		case 14: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin D\n\n\n " +
					"Dietary Sources:\n\n Egg Yolk, Milk, Exposure to sun en" +
					"ables body to make its own Vitamin D, Cod liver Oil, seeds, " +
					"lemongrass, sprouts, avocado, garlic, greens leafyVegetables(spinach),fish oil");
			break;
		case 15: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin E\n\n\n " +
					"Dietary Sources:\n\n Corn, Butter, Brown Rice, " +
					"Soybean Oil, Vegetable oils such as Corn, Cottonseed " +
					"or Soybean, Nuts, Wheat, All kind of berries, sprouts, fish oil");
			break;
		case 16: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin E\n\n\n " +
					"Dietary Sources:\n\n Corn, Butter, Brown Rice, " +
					"Soybean Oil, Vegetable oils such as Corn, Cottonseed " +
					"or Soybean, Nuts, Wheat, All kind of berries, sprouts, fish oil");
			break;
		case 17: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin E\n\n\n " +
					"Dietary Sources:\n\n Corn, Butter, Brown Rice, " +
					"Soybean Oil, Vegetable oils such as Corn, Cottonseed " +
					"or Soybean, Nuts, Wheat, All kind of berries, sprouts, fish oil");
			break;
		case 18: 
			dietdetails.setText("Nutritional Deficiency:\n\nVitamin E\n\n\n " +
					"Dietary Sources:\n\n Corn, Butter, Brown Rice, " +
					"Soybean Oil, Vegetable oils such as Corn, Cottonseed " +
					"or Soybean, Nuts, Wheat, All kind of berries, sprouts, fish oil");
			break;
		case 19: 
			dietdetails.setText("Nutritional Deficiency:\n\nCalcium\n\n\n " +
					"Dietary Sources:\n\n Milk, yoghurt, cheese, almonds, cereals, all milk products");
			break;
		case 20: 
			dietdetails.setText("Nutritional Deficiency:\n\nCalcium\n\n\n " +
					"Dietary Sources:\n\n Milk, yoghurt, cheese, almonds, cereals, all milk products");
			break;
		case 21: 
			dietdetails.setText("Nutritional Deficiency:\n\nCalcium\n\n\n " +
					"Dietary Sources:\n\n Milk, yoghurt, cheese, almonds, cereals, all milk products");
			break;
		case 22: 
			dietdetails.setText("Nutritional Deficiency:\n\nIron\n\n\n " +
					"Dietary Sources:\n\n Green Leafy vegetables,Liver,  " +
					"Meats, Kidney beans, enriched Bread, Raisins., sprouts, " +
					"almonds, apricot, , beets, cherries, dates, figs, grains, " +
					"lentils , parsley, pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 23: 
			dietdetails.setText("Nutritional Deficiency:\n\nIron\n\n\n " +
					"Dietary Sources:\n\n Green Leafy vegetables,Liver,  " +
					"Meats, Kidney beans, enriched Bread, Raisins., sprouts, " +
					"almonds, apricot, , beets, cherries, dates, figs, grains, " +
					"lentils , parsley, pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 24: 
			dietdetails.setText("Nutritional Deficiency:\n\nIron\n\n\n " +
					"Dietary Sources:\n\n Green Leafy vegetables,Liver,  " +
					"Meats, Kidney beans, enriched Bread, Raisins., sprouts, " +
					"almonds, apricot, , beets, cherries, dates, figs, grains, " +
					"lentils , parsley, pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 25: 
			dietdetails.setText("Nutritional Deficiency:\n\nIron\n\n\n " +
					"Dietary Sources:\n\n Green Leafy vegetables,Liver,  " +
					"Meats, Kidney beans, enriched Bread, Raisins., sprouts, " +
					"almonds, apricot, , beets, cherries, dates, figs, grains, " +
					"lentils , parsley, pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 26: 
			dietdetails.setText("Nutritional Deficiency:\n\nIron\n\n\n " +
					"Dietary Sources:\n\n Green Leafy vegetables,Liver,  " +
					"Meats, Kidney beans, enriched Bread, Raisins., sprouts, " +
					"almonds, apricot, , beets, cherries, dates, figs, grains, " +
					"lentils , parsley, pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 27: 
			dietdetails.setText("Nutritional Deficiency:\n\nIron\n\n\n " +
					"Dietary Sources:\n\n Green Leafy vegetables,Liver,  " +
					"Meats, Kidney beans, enriched Bread, Raisins., sprouts, " +
					"almonds, apricot, , beets, cherries, dates, figs, grains, " +
					"lentils , parsley, pistachio nuts, seeds, walnut, red meat, fish");
			break;
		case 28: 
			dietdetails.setText("Nutritional Deficiency:\n\nProtein\n\n\n " +
					"Dietary Sources:\n\n Nuts, Beans, Peanuts, Lentils, Whole grains, Spinach, seeds, soy, Peas");
			break;
		case 29: 
			dietdetails.setText("Nutritional Deficiency:\n\nProtein\n\n\n " +
					"Dietary Sources:\n\n Nuts, Beans, Peanuts, Lentils, Whole grains, Spinach, seeds, soy, Peas");
			break;
		case 30: 
			dietdetails.setText("Nutritional Deficiency:\n\nProtein\n\n\n " +
					"Dietary Sources:\n\n Nuts, Beans, Peanuts, Lentils, Whole grains, Spinach, seeds, soy, Peas");
			break;
		case 31: 
			dietdetails.setText("Nutritional Deficiency:\n\nProtein\n\n\n " +
					"Dietary Sources:\n\n Nuts, Beans, Peanuts, Lentils, Whole grains, Spinach, seeds, soy, Peas");
			break;
		case 32: 
			dietdetails.setText("Nutritional Deficiency:\n\nMinerals\n\n\n " +
					"Dietary Sources:\n\n Fruits( banana, pomegranate) and green leafy vegetables");
			break;
		case 33: 
			dietdetails.setText("Nutritional Deficiency:\n\nMinerals\n\n\n " +
					"Dietary Sources:\n\n Fruits( banana, pomegranate) and green leafy vegetables");
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
