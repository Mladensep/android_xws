package com.example.mladen.xwsclient.activity.article5_kua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article4_tv.DO1;
import com.example.mladen.xwsclient.activity.article4_tv.DO2;
import com.example.mladen.xwsclient.activity.article4_tv.DO3;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityUS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_us);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void vm() {
        Intent intent = new Intent(this, US1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void vm2() {
        Intent intent = new Intent(this, US2.class);
        startActivity(intent);
    }
}
