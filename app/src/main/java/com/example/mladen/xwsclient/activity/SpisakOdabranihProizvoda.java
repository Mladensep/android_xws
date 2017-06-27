package com.example.mladen.xwsclient.activity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.dagger.App;
import com.example.mladen.xwsclient.database.SpisakProizvoda;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;

public class SpisakOdabranihProizvoda extends AppCompatActivity {
    @Inject Realm realm;
    @BindView(R.id.tekst) TextView textView;
    @BindView(R.id.tekst2) TextView textView2;
    @BindView(R.id.ukupno) TextView ukupnaCena;
    private int ukupno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spisak_odabranih);

        ((App) getApplication()).getComponent().inject(this);

        ButterKnife.bind(this);

        RealmResults<SpisakProizvoda> sviProizvodi = realm.where(SpisakProizvoda.class).findAll();

        ukupno = 0;

        for(int i = 0; i<sviProizvodi.size(); i++) {

            int temp = sviProizvodi.get(i).getCena();
            String temp2 = String.valueOf(temp);

            textView.append("Naziv proizvoda: " + sviProizvodi.get(i).getNaziv() + "\n"+ "Cena proizvoda: " + temp2 + "\n" + "\n");


             ukupno += sviProizvodi.get(i).getCena();
        }

        String tempUkupno = String.valueOf(ukupno);
        ukupnaCena.setText("Ukupna cena: " + tempUkupno + " dinara");
    }

    @OnClick(R.id.nastavi_kuovinu)
    public void nastavi() {
        Intent intent = new Intent(this, UplatnicaActivity.class);
        intent.putExtra("cena", ukupno);
        startActivity(intent);
    }
}

