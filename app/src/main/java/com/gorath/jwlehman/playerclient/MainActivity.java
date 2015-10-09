package com.gorath.jwlehman.playerclient;

import android.app.Activity;
import android.os.Bundle;

import com.firebase.client.Firebase;




public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    Firebase fb;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.main);
        fb = new Firebase("https://intense-fire-3607.firebaseio.com/");
    }
}
