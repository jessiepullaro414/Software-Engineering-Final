package com.example.jessiepullaro.softwareengineering;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jessie on 11/30/17.
 */

public class UserDBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 21;

    // db name
    private static final String DATABASE_NAME = "drinkManager";

    // table name
    private static final String TABLE_NAME = "userTable";

    // user table column names
    private static final String KEY_ID = "_id";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    // constructor
    public UserDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // creating table
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_USERNAME + " TEXT UNIQUE, "
                + KEY_PASSWORD + " TEXT)";

        db.execSQL(CREATE_USER_TABLE);
    }

    // upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        // drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        // create table again
        onCreate(db);
    }

    /////************* All CRUD Operations (Create, Read, Update, and Delete) ***************

    // adding new user
    public void addUser(User user){

        SQLiteDatabase db = this.getWritableDatabase();

        String insertStm = "INSERT INTO " + TABLE_NAME + " ("+ KEY_USERNAME + ", " + KEY_PASSWORD + ") VALUES('" +
                user.getUsername() + "', '" + user.getPassHash() + "')";

        db.execSQL(insertStm);

        db.close(); // closing db connection
    }

    // getting single user record with specific username
    public User getUser(String username){
        SQLiteDatabase db = this.getReadableDatabase();

        String queryStm = "SELECT * FROM " + TABLE_NAME + " WHERE " + KEY_USERNAME + " = '" + username +"'";

        Cursor c = db.rawQuery(queryStm, null);

        if (c != null) c.moveToFirst();

        User user = new User(c.getString(1), c.getString(2));

        c.close();

        db.close(); // closing db connection

        // return contact
        return user;
    }

    // updating user password (not needed at the moment)
    // public void updateUserPassword(User user, String passHash){
    //  SQLiteDatabase db = this.getWritableDatabase();
    //
    //String updateStm = "UPDATE " + TABLE_NAME + " SET " + KEY_PASSWORD + " = '" + passHash
    //      + "' WHERE " + KEY_EMAIL + " = " + user.getEmail();
    //
    // db.execSQL(updateStm);
    //
    // db.close(); // closing db connection
    // }

    // deleting single user record (not needed at the moment)
    //public void deleteUser(User user){
    //  SQLiteDatabase db = this.getWritableDatabase();
    //
    //  String deleteStm = "DELETE FROM " + TABLE_NAME + " WHERE " + KEY_EMAIL + " = " + user.getEmail();
    //
    //  db.execSQL(deleteStm);
    //
    //  db.close(); // closing db connection
    //}

}
