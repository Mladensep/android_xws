package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article4_tv.ActivityDO;
import com.example.mladen.xwsclient.activity.article4_tv.ActivityTV;
import com.example.mladen.xwsclient.activity.article5_kua.ActivityLAM;
import com.example.mladen.xwsclient.activity.article5_kua.ActivityPG;
import com.example.mladen.xwsclient.activity.article5_kua.ActivityUS;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Article5KUA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_activiry5_ku);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.usisivac)
    public void vm2() {
        Intent intent = new Intent(this, ActivityUS.class);
        startActivity(intent);
    }

    @OnClick(R.id.pegla)
    public void vm3() {
        Intent intent = new Intent(this, ActivityPG.class);
        startActivity(intent);
    }

    @OnClick(R.id.lampa)
    public void vm4() {
        Intent intent = new Intent(this, ActivityLAM.class);
        startActivity(intent);
    }
}
