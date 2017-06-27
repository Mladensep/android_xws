package com.example.mladen.xwsclient.activity.article4_tv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article3_foto.Fotoaparat1;
import com.example.mladen.xwsclient.activity.article3_foto.Fotoaparat2;
import com.example.mladen.xwsclient.activity.article3_foto.Fotoaparat3;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityTV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tv);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void vm() {
        Intent intent = new Intent(this, TV1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void vm2() {
        Intent intent = new Intent(this, TV2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void vm3() {
        Intent intent = new Intent(this, TV3.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
