package com.example.jessiepullaro.softwareengineering;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

/**
 * Created by slatercolteryahn on 11/28/17.
 */

public class InventoryMenu extends Activity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstancesBundle)
    {
        super.onCreate(savedInstancesBundle);
        setContentView(R.layout.inventory_activity);

        preferences = getApplicationContext().getSharedPreferences("data", MODE_PRIVATE);

    }







}
