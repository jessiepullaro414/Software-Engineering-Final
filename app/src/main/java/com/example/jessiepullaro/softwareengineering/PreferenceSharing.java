package com.example.jessiepullaro.softwareengineering;

import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * Created by slatercolteryahn on 12/6/17.
 */

public class PreferenceSharing extends PreferenceActivity {

        private SharedPreferences getPreferences() {
            return PreferenceManager.getDefaultSharedPreferences(this);
        }

        private  SharedPreferences.Editor getEditor() {
            SharedPreferences sp = getPreferences();
            if (sp != null)
                return sp.edit();

            return null;
        }

        public  int getPref(String key, int defValue) {
            SharedPreferences sp = getPreferences();
            if (sp == null)
                return defValue;
            return sp.getInt(key, defValue);
        }

        public void putPref(String key, int val) {
            SharedPreferences.Editor spe = getEditor();
            if (spe == null)
                return;
            spe.putInt(key, val);
            spe.commit();
        }

        public boolean getPref(String key, boolean defValue) {
            SharedPreferences sp = getPreferences();
            if (sp == null)
                return defValue;
            return sp.getBoolean(key, defValue);
        }

        public void putPref(String key, boolean val) {
            SharedPreferences.Editor spe = getEditor();
            if (spe == null)
                return;
            spe.putBoolean(key, val);
            spe.commit();
        }

        public long getPref(String key, long defValue) {
            SharedPreferences sp = getPreferences();
            if (sp == null)
                return defValue;
            return sp.getLong(key, defValue);
        }

        public void putPref(String key, long val) {
            SharedPreferences.Editor spe = getEditor();
            if (spe == null)
                return;
            spe.putLong(key, val);
            spe.commit();
        }

        public String getPref(String key, String defValue) {
            SharedPreferences sp = getPreferences();
            if (sp == null)
                return defValue;
            return sp.getString(key, defValue);
        }

        public void putPref(String key, String val) {
            SharedPreferences.Editor spe = getEditor();
            if (spe == null)
                return;
            spe.putString(key, val);
            spe.commit();
        }

        public void removePref(String key) {
            SharedPreferences.Editor spe = getEditor();
            if (spe == null)
                return;
            spe.remove(key);
            spe.commit();
        }

        public void clear() {
            SharedPreferences.Editor spe = getEditor();
            if (spe == null)
                return;
            spe.clear();
            spe.commit();
        }
    }
