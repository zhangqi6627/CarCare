package com.quet.zq.carcare;

import java.util.ArrayList;
import java.util.HashMap;
import com.quet.zq.carcare.adapter.MyCarListAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MyCarListActivity extends Activity {
	private ListView list_cars;
	private Context mContext = MyCarListActivity.this;
	private MyCarListAdapter myCarListAdapter;
	private ArrayList<HashMap<String, String>> myCars;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mycar);
		myCars = getMyCars();
		list_cars = (ListView) findViewById(R.id.list_cars);
		myCarListAdapter = new MyCarListAdapter(mContext, myCars);
		list_cars.setAdapter(myCarListAdapter);
	}
	private ArrayList<HashMap<String, String>> getMyCars() {
		ArrayList<HashMap<String, String>> myCars = new ArrayList<HashMap<String, String>>();
		return myCars;
	}
}
