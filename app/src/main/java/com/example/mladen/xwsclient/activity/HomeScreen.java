package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod)
    public void kupi() {
        Intent intent = new Intent(this, AllArticles.class);
        startActivity(intent);
    }

    @OnClick(R.id.dobavi_izvod)
    public void dobavi() {
        Intent intent = new Intent(this, DobaviIzvod.class);
        startActivity(intent);
    }
}
