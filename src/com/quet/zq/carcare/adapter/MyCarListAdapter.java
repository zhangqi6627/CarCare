package com.quet.zq.carcare.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import com.quet.zq.carcare.CarSelectActivity;
import com.quet.zq.carcare.R;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCarListAdapter extends BaseAdapter {
	private Context context;
	private ArrayList<HashMap<String, String>> myCars;
	public MyCarListAdapter(Context context, ArrayList<HashMap<String, String>> myCars) {
		this.context = context;
		this.myCars = myCars;
	}
	@Override
	public int getCount() {
		return myCars.size() + 1;
	}
	@Override
	public Object getItem(int arg0) {
		return arg0;
	}
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
	@Override
	public View getView(int position, View converView, ViewGroup viewGroup) {
		// TODO Auto-generated method stub
		if(position == myCars.size()){
			TextView tv_add = new TextView(context);
			tv_add.setText("ADD");
			tv_add.setGravity(Gravity.CENTER);
			tv_add.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					context.startActivity(new Intent(context,CarSelectActivity.class));
				}
			});
			return tv_add;
		}
		ViewHolder viewHolder = null;
		if (converView == null) {
			converView = LayoutInflater.from(context).inflate(R.layout.adapter_car, null, false);
			viewHolder = new ViewHolder();
			viewHolder.iv_car = (ImageView) converView.findViewById(R.id.iv_car);
			viewHolder.tv_name = (TextView) converView.findViewById(R.id.tv_name);
			converView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) converView.getTag();
		}
		HashMap<String, String> carInfo = myCars.get(position);
		String name = (String) carInfo.get("name");
		//viewHolder.iv_car.setImageBitmap(bm);
		viewHolder.tv_name.setText(name);
		return converView;
	}
	
	private static class ViewHolder {
		private ImageView iv_car;
		private TextView tv_name;
	}
}