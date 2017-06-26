package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article4_tv.ActivityDO;
import com.example.mladen.xwsclient.activity.article4_tv.ActivityTV;
import com.example.mladen.xwsclient.activity.article4_tv.TV2;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article4TV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_article4_tv);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv)
    public void vm2() {
        Intent intent = new Intent(this, ActivityTV.class);
        startActivity(intent);
    }

    @OnClick(R.id.dodatna)
    public void vm3() {
        Intent intent = new Intent(this, ActivityDO.class);
        startActivity(intent);
    }
}
