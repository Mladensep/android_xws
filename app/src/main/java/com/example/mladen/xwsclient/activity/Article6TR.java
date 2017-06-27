package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article5_kua.Lampa1;
import com.example.mladen.xwsclient.activity.article6_tr.ActivityGR;
import com.example.mladen.xwsclient.activity.article6_tr.ActivityKL;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article6TR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_article6_tr);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.grejanje)
    public void vm1() {
        Intent intent = new Intent(this, ActivityGR.class);
        startActivity(intent);
    }

    @OnClick(R.id.klima)
    public void vm2() {
        Intent intent = new Intent(this, ActivityKL.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
