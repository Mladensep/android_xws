package com.example.mladen.xwsclient.activity.article1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mladen.xwsclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivitySporet extends AppCompatActivity {
    //@BindView(R.id.naziv_pr) TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sporet);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kupi_proizvod1)
    public void kupi_proizvod1() {
        //tv.setText("Naziv proizvoda: Sporet 1");
        Intent intent = new Intent(this, ActivitySporet1.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod2)
    public void kupi_proizvod2() {
        Intent intent = new Intent(this, ActivitySporet2.class);
        startActivity(intent);
    }

    @OnClick(R.id.kupi_proizvod3)
    public void kupi_proizvod3() {
        Intent intent = new Intent(this, ActivitySporet3.class);
        startActivity(intent);
    }
}
