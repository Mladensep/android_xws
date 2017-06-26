package com.example.mladen.xwsclient.activity.article2_it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article2IT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_article2_it);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.laptop)
    public void vm1() {
        Intent intent = new Intent(this, ActivityLaptop.class);
        startActivity(intent);
    }

    @OnClick(R.id.mobilni)
    public void vm2() {
        Intent intent = new Intent(this, ActivityMobilni.class);
        startActivity(intent);
    }

    @OnClick(R.id.tablet)
    public void vm3() {
        Intent intent = new Intent(this, ActivityTablet.class);
        startActivity(intent);
    }
}
