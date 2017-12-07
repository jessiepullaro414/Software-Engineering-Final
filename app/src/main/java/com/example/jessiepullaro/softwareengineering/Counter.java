package com.example.jessiepullaro.softwareengineering;

import java.security.SecureRandom;

/**
 * Created by jessiepullaro on 11/29/17.
 */

public class Counter {

    private int mCount;

    public Counter(){

        mCount = 0;

    }

    public String addCount(){

        mCount++;

        return getCount();

    }

    public String getCount(){
        return Integer.toString(mCount);

    }
}
