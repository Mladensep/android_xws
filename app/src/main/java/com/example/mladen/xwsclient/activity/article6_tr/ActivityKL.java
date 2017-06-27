package com.example.mladen.xwsclient.activity.article6_tr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article5_kua.Lampa1;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityKL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_kl);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void vm() {
        Intent intent = new Intent(this, Klima1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void vm2() {
        Intent intent = new Intent(this, Klima2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void vm3() {
        Intent intent = new Intent(this, Klima3.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
