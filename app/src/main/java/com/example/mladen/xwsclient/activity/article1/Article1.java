package com.example.mladen.xwsclient.activity.article1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_article1);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.ves_masine)
    public void vm() {
        Intent intent = new Intent(this, ActivityVesMasina.class);
        startActivity(intent);
    }

    @OnClick(R.id.frizideri)
    public void fr() {
        Intent intent = new Intent(this, ActivityFrizider.class);
        startActivity(intent);
    }

    @OnClick(R.id.sporeti)
    public void sp() {
        Intent intent = new Intent(this, ActivitySporet.class);
        startActivity(intent);
    }

    @OnClick(R.id.zamrzivac)
    public void kl() {
        Intent intent = new Intent(this, ActivityZamrzivac.class);
        startActivity(intent);
    }
}
