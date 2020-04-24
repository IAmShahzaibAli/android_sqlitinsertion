package com.coronavirus.world.cases.databaseapplicaiton;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper
{

    private static  String Key_id = "ID";
    private static  String Key_Name = "NAME";
    private static  String Key_Email = "EMAIL";
    private static  String Key_Mobile = "MOBILE";
    private static  String Key_Table = "user_table";





    public DBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String create_user = "CREATE TABLE "+Key_Table+"("+Key_id+"INTEGER PRIMARY KEY,"+Key_Name+"TEXT,"
                +Key_Email+"TEXT,"+Key_Mobile+"Text"+")";
        db.execSQL(create_user);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public  int InsertUser(User user)
    {
        int i = 0;
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Key_id,user.getId());
        contentValues.put(Key_Name,user.getName());
        contentValues.put(Key_Email,user.getEmail());
        contentValues.put(Key_Mobile,user.getMobile());

        sqLiteDatabase.insert(Key_Table,null,contentValues);
        i=1;
        return  i;





    }

















}
