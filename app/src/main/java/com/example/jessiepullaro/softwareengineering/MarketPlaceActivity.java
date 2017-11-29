package com.example.jessiepullaro.softwareengineering;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

/**
 * Created by slatercolteryahn on 11/28/17.
 */

public class MarketPlaceActivity extends Activity {

Intent i = new Intent(String.valueOf(MarketPlaceActivity.this));

    public Integer housePrice = 5;
    public Integer carPrice  = 4;
    public Integer breadPrice = 1;
    public Integer waterPrice  = 1;
    public Integer chickenPrice  = 2;
    public Integer spicyEnchiladaPrice = 10;
    public Integer pubSubPrice = 10;

    public Integer house;
    public Integer car;
    public Integer bread;
    public Integer water;
    public Integer chicken;
    public Integer spicyEnchilada;
    public Integer pubSub;

    String strHouse;
    String strCar;
    String strBread;
    String strWater;
    String strChicken;
    String strEnchilada;
    String str

    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstancesBundle)
    {
        super.onCreate(savedInstancesBundle);
        setContentView(R.layout.marketplace_activity);

        preferences = getApplicationContext().getSharedPreferences("data", MODE_PRIVATE);

    }



     public void onBuyHouse(View view){



     }

    public void onBuyCar(View view)
     {


     }

     public void onBuyBread(View view)
     {


     }
    public void onBuyWater(View view)
     {



     }
     public void onBuyChicken(View view)
     {


     }
    public void onBuyEnchilada (View view)
     {


     }
    public void onBuyPubSub(View view)
     {


     }





}
