package com.example.mladen.xwsclient.activity.article7_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article6_tr.Grejalica1;
import com.example.mladen.xwsclient.activity.article6_tr.Grejalica2;
import com.example.mladen.xwsclient.activity.article6_tr.Grejalica3;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivitySL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sl);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void vm() {
        Intent intent = new Intent(this, Slusalice1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void vm2() {
        Intent intent = new Intent(this, Slusalice2.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
