package com.example.deezy.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.deezy.habittracker.data.HabitDbHelper;
import com.example.deezy.habittracker.data.HabitContract.HabitEntry;

public class MainActivity extends AppCompatActivity {
    HabitDbHelper mDbHelper = new HabitDbHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayDatabaseInfo() {


        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                HabitEntry._ID,
                HabitEntry.COLUMN_NAME,
                HabitEntry.COLUMN_AGE,
                HabitEntry.COLUMN_MARITAL_STATUS,
                HabitEntry.COLUMN_WORK,
                HabitEntry.COLUMN_EXERCISE,
                HabitEntry.COLUMN_STUDY,
                HabitEntry.COLUMN_BREAKFAST
        };

        Cursor cursor = db.query(HabitEntry.TABLE_NAME, projection, null, null, null, null, null, null);
    }

    private void insertHabit() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(HabitEntry.COLUMN_NAME, "John");
        values.put(HabitEntry.COLUMN_AGE, 21);
        values.put(HabitEntry.COLUMN_MARITAL_STATUS, HabitEntry.SINGLE);
        values.put(HabitEntry.COLUMN_WORK, HabitEntry.YES);
        values.put(HabitEntry.COLUMN_STUDY, HabitEntry.YES);
        values.put(HabitEntry.COLUMN_EXERCISE, HabitEntry.YES);
        values.put(HabitEntry.COLUMN_BREAKFAST, HabitEntry.YES);

        db.insert(HabitEntry.TABLE_NAME, null, values);
    }
}
