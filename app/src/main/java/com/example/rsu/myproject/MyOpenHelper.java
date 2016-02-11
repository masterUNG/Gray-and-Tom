package com.example.rsu.myproject;

import android.content.Context;

/**
 * Created by masterUNG on 2/11/16 AD.
 */
public class MyOpenHelper {

    //Explicit
    public static final String database_name = "rsu.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password text, " +
            "Name text);";

    private static final String create_major_table = "create table majorTABLE (" +
            "_id integer primary key, " +
            "Category text, " +
            "NameMajor text, " +
            "Web text, " +
            "Image text, " +
            "Detail text," +
            "Lat text, " +
            "Lng text);";


    public MyOpenHelper(Context context) {
    }   // Constructor

}   // Main Class
