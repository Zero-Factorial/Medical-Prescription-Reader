package com.rifat.medical.prescription.reader;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(Context context, String db_name) {
        super(context, db_name, null, 10);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Cursor getAllData(String tableName, String Name) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from '"+tableName+"' where TRIM(Name) = '"+Name+"' "  , null);

        return res;

    }
}
