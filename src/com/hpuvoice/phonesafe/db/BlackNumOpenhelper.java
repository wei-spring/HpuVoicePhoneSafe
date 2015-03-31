package com.hpuvoice.phonesafe.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BlackNumOpenhelper extends SQLiteOpenHelper {

	public BlackNumOpenhelper(Context context) {
		super(context, "blacknum.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table commonnum(id integer"
				+ " primary key autoincrement,"
				+ "name varchar(32) ,number varchar(20),title_id varchar(2))");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}