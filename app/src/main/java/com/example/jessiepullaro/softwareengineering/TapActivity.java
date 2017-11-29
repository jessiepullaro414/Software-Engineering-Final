package com.example.jessiepullaro.softwareengineering;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



/**
 * Created by Rigaud on 11/29/2017.
 */

public class TapActivity extends Activity{
    TextView counter;
    int numTapped;

    @Override
    public void onCreate(Bundle savedInstancesState)
    {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.tapgame_layout);

        counter = (TextView)findViewById(R.id.counterTV);
    }

    public void buttonTapped(View view)
    {
        numTapped = numTapped + 1;
        counter.setText(numTapped);

    }

    public void goBackToMenu(View view)
    {
        finish();
    }
}
