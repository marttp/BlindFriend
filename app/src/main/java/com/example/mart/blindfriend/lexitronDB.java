package com.example.mart.blindfriend;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class lexitronDB  extends SQLiteAssetHelper{
    private static final String DATABASE_NAME = "lexitron.sqlite";
    private static final int DATABASE_VERSION = 1;

    public lexitronDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
