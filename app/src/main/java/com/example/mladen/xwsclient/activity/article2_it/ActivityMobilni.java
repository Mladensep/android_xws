package com.example.mladen.xwsclient.activity.article2_it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityMobilni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mobilni);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void vm() {
        Intent intent = new Intent(this, ActivityMobilni1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void vm2() {
        Intent intent = new Intent(this, ActivityMobilni2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void vm3() {
        Intent intent = new Intent(this, ActivityMobilni3.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod4)
    public void vm4() {
        Intent intent = new Intent(this, ActivityMobilni4.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
