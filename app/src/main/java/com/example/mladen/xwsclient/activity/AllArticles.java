package com.example.mladen.xwsclient.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.article1.Article1;
import com.example.mladen.xwsclient.activity.article2_it.Article2IT;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AllArticles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_all_articles);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.article1)
    public void relative1() {
        Intent intent = new Intent(this, Article1.class);
        startActivity(intent);
    }

    @OnClick(R.id.article2MU)
    public void relative2() {
        Intent intent = new Intent(this, Article2IT.class);
        startActivity(intent);
    }

    @OnClick(R.id.article3ku)
    public void relative3() {
        Intent intent = new Intent(this, Article3Foto.class);
        startActivity(intent);
    }

    @OnClick(R.id.article4tv)
    public void relative4() {
        Intent intent = new Intent(this, Article4TV.class);
        startActivity(intent);
    }

    @OnClick(R.id.article5)
    public void realtive5() {
        Intent intent = new Intent(this, Article5KUA.class);
        startActivity(intent);
    }

    @OnClick(R.id.article6)
    public void realtive6() {
        Intent intent = new Intent(this, Article6TR.class);
        startActivity(intent);
    }

    @OnClick(R.id.article5do)
    public void relative7() {
        Intent intent = new Intent(this, Article7DO.class);
        startActivity(intent);
    }
}
