package com.example.mladen.xwsclient.activity.article1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.activity.SpisakOdabranihProizvoda;
import com.example.mladen.xwsclient.dagger.App;
import com.example.mladen.xwsclient.database.SpisakProizvoda;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;

public class ActivityVMasina3 extends AppCompatActivity {
    @BindView(R.id.kolicina) EditText kolicina;
    @BindView(R.id.ukupna_cena) TextView ukupna;
    public int rez = 30000;
    @Inject
    Realm realm;
    String naziv = "Ves masina 3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vmasina3);

        ButterKnife.bind(this);

        ((App) getApplication()).getComponent().inject(this);
    }

    @OnClick(R.id.nova_cena)
    public void novaCena() {
        String tekst = kolicina.getText().toString();

        if(!tekst.matches("[1-9]"))
            Toast.makeText(this, "Unesite kolicinu", Toast.LENGTH_SHORT).show();

        else {
            rez = 30000;

            int nova = Integer.parseInt(kolicina.getText().toString());
            rez *= nova;

            String ukupno = String.valueOf(rez);
            ukupna.setText(ukupno + " din");
        }
    }

    @OnClick(R.id.dobavi_izvod)
    public void posalji() {
        realm.beginTransaction();

        SpisakProizvoda spisak = realm.createObject(SpisakProizvoda.class);

        spisak.setCena(rez);
        spisak.setNaziv(naziv);

        realm.commitTransaction();

        Toast toast = Toast.makeText(this, "Proizvod je dodat", Toast.LENGTH_SHORT);
        toast.show();
    }

    @OnClick(R.id.zavrsi_kupovinu)
    public void zavrsi() {
        Intent intent = new Intent(this, SpisakOdabranihProizvoda.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_icon)
    public void nazad() {
        finish();
    }
}
