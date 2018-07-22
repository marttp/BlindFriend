package com.example.mart.blindfriend;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.ArrayList;
import java.util.List;

public class lexitronAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static lexitronAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private lexitronAccess(Context context) {
        this.openHelper = new lexitronDB(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static lexitronAccess getInstance(Context context) {
        if (instance == null) {
            instance = new lexitronAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public String getQuotes(String input) {
//        List<String> list = new ArrayList<>();
        String output;
        Cursor cursor = database.rawQuery("SELECT tentry FROM eng2th WHERE esearch = '"+input+"'", null);
        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            list.add(cursor.getString(0));
//            cursor.moveToNext();
//        }
//        list.add(cursor.getString(0));
//        cursor.close();
        output = cursor.getString(0);
        cursor.close();
        return output;
    }
}
