package com.example.jessiepullaro.softwareengineering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



/**
 * Created by Rigaud and Jessie on 11/29/2017.
 */
public class TapActivity extends Activity{
    private Counter counter;
    private TextView  numTapped;
    private String numTappedString;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    public void onCreate(Bundle savedInstancesState)
    {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.tapgame_layout);

        counter = new Counter();
        numTapped = findViewById(R.id.counterTV);

        preferences = getApplicationContext().getSharedPreferences("data", MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void buttonTapped(View view)
    {
        numTapped.setText(counter.addCount());

    }

    public void goBackToMenu(View view)
    {
        int a = Integer.parseInt(preferences.getString("numPressed", null));
        numTappedString = numTapped.getText().toString();
        int n = Integer.parseInt(numTappedString);

        editor.putString("numPressed", String.valueOf(n+a) );
        editor.commit();
        finish();
    }
}

