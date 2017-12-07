package com.example.jessiepullaro.softwareengineering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by slatercolteryahn on 11/28/17.
 */

public class MarketPlaceActivity extends Activity {

Intent i = new Intent(String.valueOf(MarketPlaceActivity.this));

    public Integer housePrice = 10;
    public Integer carPrice = 5;
    public Integer breadPrice = 1;
    public Integer waterPrice = 1;
    public Integer chickenPrice = 5;
    public Integer spicyEnchiladaPrice = 10;
    public Integer pubSubPrice = 10;


    private static final String BOUGHT_HOUSE = "House";
    private static final String TOTAL_COINS = "Coins";
    private static final String BOUGHT_CAR = "Car";
    private static final String BOUGHT_BREAD= "Bread";
    private static final String BOUGHT_WATER = "Water";
    private static final String BOUGHT_CHICKEN = "Chicken";
    private static final String BOUGHT_ENCHILADA = "SpicyEnchilada";
    private static final String BOUGHT_PUBSUB = "strPubSub";


    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    TextView viewHouse;
    TextView viewCar;
    TextView viewBread;
    TextView viewWater;
    TextView viewChicken;
    TextView viewEnchilada;
    TextView viewPubSub;


    Context c = this; // for the activity

    @Override
    protected void onCreate(Bundle savedInstancesBundle)
    {
        super.onCreate(savedInstancesBundle);
        setContentView(R.layout.marketplace_activity);


        preferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String value = (preferences.getString("data", "Market_Value"));
        editor = preferences.edit();


    }

    public void onBuyHouse(View view){

        if(housePrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -housePrice);
            editor.putInt(BOUGHT_HOUSE, 1);
        }
        else{

            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }}

    public void onBuyCar(View view)
    {
        if(carPrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -carPrice);
            editor.putInt(BOUGHT_CAR, 1);
        }
        else{
            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }

    }

    public void onBuyBread(View view)
    {
        if(breadPrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -breadPrice);
            editor.putInt(BOUGHT_BREAD, 1);
        }
        else{
            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }

    }
    public void onBuyWater(View view)
    {
        if(waterPrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -waterPrice);
            editor.putInt(BOUGHT_WATER, 1);
        }
        else{
            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }}

    public void onBuyChicken(View view)
    {
        if(chickenPrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -chickenPrice);
            editor.putInt(BOUGHT_CHICKEN, 1);
        }
        else{
            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }}


    public void onBuyEnchilada (View view)
    {
        if(spicyEnchiladaPrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -spicyEnchiladaPrice);
            editor.putInt(BOUGHT_ENCHILADA, 1);
        }
        else{
            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }}


    public void onBuyPubSub(View view)
    {
        if(pubSubPrice < preferences.getInt(TOTAL_COINS, -1)) {
            editor.putInt(TOTAL_COINS, -pubSubPrice);
            editor.putInt(BOUGHT_PUBSUB, 1);
        }
        else{
            Toast.makeText(getApplicationContext(), "You don't own enough Coin!", Toast.LENGTH_SHORT);
        }}

}
