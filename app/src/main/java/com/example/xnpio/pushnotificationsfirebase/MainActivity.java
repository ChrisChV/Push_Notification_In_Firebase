package com.example.xnpio.pushnotificationsfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    public static boolean isAppRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic("test");
        isAppRunning = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        isAppRunning = false;
    }
}
