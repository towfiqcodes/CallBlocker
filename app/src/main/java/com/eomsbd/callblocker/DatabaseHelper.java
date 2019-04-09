package com.eomsbd.callblocker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseHelper extends SQLiteOpenHelper {
    // Define the SQLite database name
    private static final String DATABASE_NAME = "call_blocker.db";

    // Define the SQLite database version
    private static final int DATABASE_VERSION = 1;

    // Define the SQLite Table name to create
    public static final String TABLE_BLACKLIST = "blacklist";

    // Table creation SQL statement
    private static final String TABLE_CREATE = "create table "  + TABLE_BLACKLIST + "( id "
            + " integer primary key autoincrement, phone_number  text not null);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
