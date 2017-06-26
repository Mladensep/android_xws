package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.mladen.xwsclient.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {

                    startActivity(new Intent(SplashScreen.this, HomeScreen.class));
                    finish();

            }
        }, secondsDelayed * 3000);
    }
    @Override
    public void onBackPressed() {}
}

