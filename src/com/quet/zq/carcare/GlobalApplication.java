package com.quet.zq.carcare;

import java.util.ArrayList;
import com.quet.zq.carcare.data.DatabaseHelper;
import com.quet.zq.carcare.utils.Util;
import android.R.anim;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class GlobalApplication extends Application{
	private Context mContext = GlobalApplication.this;
	private DatabaseHelper dbHelper;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
	}
}
