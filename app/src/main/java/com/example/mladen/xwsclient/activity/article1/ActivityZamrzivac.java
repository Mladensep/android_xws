package com.example.mladen.xwsclient.activity.article1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityZamrzivac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_zamrzivac);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void kupi_proizvod1() {
        Intent intent = new Intent(this, ActivityZamrzivac1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void kupi_proizvod2() {
        Intent intent = new Intent(this, ActivityZamrzivac2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void kupi_proizvod3() {
        Intent intent = new Intent(this, ActivityZamrzivac3.class);
        startActivity(intent);
    }
}
