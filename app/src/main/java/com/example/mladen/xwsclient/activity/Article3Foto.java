package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article3_foto.ActivityFotoaparati;
import com.example.mladen.xwsclient.activity.article3_foto.ActivityKamere;
import com.example.mladen.xwsclient.activity.article3_foto.Kamera1;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article3Foto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_article3_foto);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kamere)
    public void vm() {
        Intent intent = new Intent(this, ActivityKamere.class);
        startActivity(intent);
    }

    @OnClick(R.id.fotoaparati)
    public void vm2() {
        Intent intent = new Intent(this, ActivityFotoaparati.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
