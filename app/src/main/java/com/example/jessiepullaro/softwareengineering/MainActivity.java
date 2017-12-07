package com.example.jessiepullaro.softwareengineering;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * Created by jessiepullaro on 11/29/17.
 */

public class MainActivity extends Activity {

    private TextView counterView;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstancesBundle)
    {
        super.onCreate(savedInstancesBundle);
        setContentView(R.layout.activity_main);
        counterView = (TextView) findViewById(R.id.counters);
        preferences = getApplicationContext().getSharedPreferences("data", MODE_PRIVATE);

    }

    public void onStart() {
        super.onStart();
        counterUpdate();
    }

    public void counterUpdate(){

        counterView.setText(preferences.getString("numPressed", null));
    }
    public void goToMarketplace(View view)
    {
        Intent i = new Intent(MainActivity.this, MarketPlaceActivity.class);
        startActivity(i);
    }

    public void goToInvent(View view)
    {
        Intent i = new Intent(MainActivity.this, InventoryMenu.class);
        startActivity(i);
    }

    public void goToGame(View view)
    {
        Intent i = new Intent(MainActivity.this, TapActivity.class);
        startActivity(i);
    }
}
