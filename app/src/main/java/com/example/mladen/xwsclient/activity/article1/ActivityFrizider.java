package com.example.mladen.xwsclient.activity.article1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityFrizider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_frizider);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void kupi_proizvod1() {
        Intent intent = new Intent(this, ActivityFrizider1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void kupi_proizvod2() {
        Intent intent = new Intent(this, ActivityFrizider2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void kupi_proizvod3() {
        Intent intent = new Intent(this, ActivityFrizider3.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
