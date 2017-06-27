package com.example.mladen.xwsclient.activity.article3_foto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article2_it.ActivityLaptop1;
import com.example.mladen.xwsclient.activity.article2_it.ActivityLaptop2;
import com.example.mladen.xwsclient.activity.article2_it.ActivityLaptop3;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityKamere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_kamere);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void vm() {
        Intent intent = new Intent(this, Kamera1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void vm2() {
        Intent intent = new Intent(this, Kamera2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void vm3() {
        Intent intent = new Intent(this, Kamera3.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
