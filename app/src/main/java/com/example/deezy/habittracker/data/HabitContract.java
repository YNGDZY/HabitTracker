package com.example.deezy.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by DEEZY on 20/07/2017.
 */

public final class HabitContract {

    private HabitContract() {
    }

    public static final class HabitEntry implements BaseColumns {
        public static final String TABLE_NAME = "Habits";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "Name";
        public static final String COLUMN_AGE = "Age";
        public static final String COLUMN_MARITAL_STATUS = "Marital Status";
        public static final String COLUMN_EXERCISE = "Exercise";
        public static final String COLUMN_WORK = "Work";
        public static final String COLUMN_STUDY = "Study";
        public static final String COLUMN_BREAKFAST = "Breakfast";

        public static final int NO = 0;
        public static final int YES = 1;
        public static final int WONT_SAY = 0;
        public static final int SINGLE = 1;
        public static final int IN_RELATIONSHIP = 2;
        public static final int MARRIED = 3;
    }
}
