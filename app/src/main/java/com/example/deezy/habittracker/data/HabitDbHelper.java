package com.example.deezy.habittracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.deezy.habittracker.data.HabitContract.HabitEntry;

/**
 * Created by DEEZY on 20/07/2017.
 */

public class HabitDbHelper extends SQLiteOpenHelper {
    public final static String DATABASE_NAME = "habits.db";
    public final static int DATABASE_VERSION = 1;

    public HabitDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_HABITS_TABLE = "CREATE TABLE " + HabitEntry.TABLE_NAME + " ("
                + HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_AGE + " INTEGER, "
                + HabitEntry.COLUMN_MARITAL_STATUS + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_WORK + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_STUDY + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_EXERCISE + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_BREAKFAST + " INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_HABITS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


