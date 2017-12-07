package com.example.jessiepullaro.softwareengineering;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by slatercolteryahn on 12/6/17.
 */

public class PreferenceSharing {

    public static void setPreferences(String key, String value, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("data", null);
        editor.commit();
    }

    public static String getPreferences(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("data", null);
    }
}
