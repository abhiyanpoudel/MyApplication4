package com.example.getme.form1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlDatabase extends SQLiteOpenHelper {
    //Database name
    static final String DATABASE_NAME = "Student_info";
    //Database version
    static final int DATABASE_VERSION = 1;
    //Database table name
    String CreateUserTableSql = "CREATE TABLE if not exists`user` ( `id` INTEGER PRIMARY KEY AUTOINCREMENT, `firstname` TEXT, `lastname` TEXT, `phoneno` TEXT, `password` TEXT, `image` BLOB, `email` TEXT )";


    public SqlDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        getWritableDatabase().execSQL(CreateUserTableSql);
    }

    public void insertUser() {

    }

    public void insertProduct() {

    }

    public void concept() {



    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
