package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article7_do.ActivityRS;
import com.example.mladen.xwsclient.activity.article7_do.ActivitySL;
import com.example.mladen.xwsclient.activity.article7_do.ActivityST;
import com.example.mladen.xwsclient.activity.article7_do.ActivityUSB;
import com.example.mladen.xwsclient.activity.article7_do.USB1;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article7DO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_article7_do);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.slusalice)
    public void vm() {
        Intent intent = new Intent(this, ActivitySL.class);
        startActivity(intent);
    }

    @OnClick(R.id.usb)
    public void vm2() {
        Intent intent = new Intent(this, ActivityUSB.class);
        startActivity(intent);
    }

    @OnClick(R.id.sat)
    public void vm3() {
        Intent intent = new Intent(this, ActivityRS.class);
        startActivity(intent);
    }

    @OnClick(R.id.stampac)
    public void vm4() {
        Intent intent = new Intent(this, ActivityST.class);
        startActivity(intent);
    }
}
