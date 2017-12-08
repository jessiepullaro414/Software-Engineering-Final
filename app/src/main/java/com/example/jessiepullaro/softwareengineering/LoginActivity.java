package com.example.jessiepullaro.softwareengineering;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    UserDBHelper userDBHelper;

    private EditText username, password;
    private Button signInButton, registerButton;
    private String loggedInUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);

        userDBHelper = new UserDBHelper(this);

    }

    public String hashPassword( String password) {
        //TODO hasher slinging slasher
        return "later";
    }

    public void signIn(View view){
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
//        try {
//            User user = userDBHelper.getUser(username.getText().toString());
//            if (user.getPassHash() == password.getText().toString()) {
//                loggedInUser = username.getText().toString();
//                Intent i = new Intent(LoginActivity.this, MenuActivity.class);
//                startActivity(i);
//            }
//
//        }catch (Error e){
//            Context context = getApplicationContext();
//            CharSequence text = "Authentication FAILED!";
//            int duration = Toast.LENGTH_LONG;
//
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//        }
    }

    public void register(View view){
        try {
            if (password.getText().toString() != null &&
                    password.getText().toString().length() >= 8 &&
                    password.getText().toString().matches("[A-Za-z0-9]+")) {
                String passHash = password.getText().toString(); //TODO pass password into hasher ("^.*[^a-zA-Z0-9 ].*$" use to accept symbols)


                if (username.getText().toString().matches("[A-Za-z0-9]+")) {
                    User user = new User(username.getText().toString(), passHash);
                    userDBHelper.addUser(user);
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Username must userDBHelper.addUser(user); only be alphanumeric";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
            else {
                Context context = getApplicationContext();
                CharSequence text = "Password cannot be null.\n" +
                        "Password must be at least 8 characters.\n" +
                        "Password must contain at least 1 number.\n" +
                        "Password must contain at lower and uppercase letters.";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        } catch (Error e){

        }
    }

    public String getLoggedInUser(){
        return loggedInUser;
    }
}

