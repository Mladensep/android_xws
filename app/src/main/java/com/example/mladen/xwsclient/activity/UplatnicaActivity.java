package com.example.mladen.xwsclient.activity;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.dagger.App;
import com.example.mladen.xwsclient.database.SpisakProizvoda;
import com.example.mladen.xwsclient.model.RecieveOrderModel;
import com.example.mladen.xwsclient.model.SendOrderModel;
import com.example.mladen.xwsclient.model.Uplatnica;
import com.example.mladen.xwsclient.services.RestAPI;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class UplatnicaActivity extends AppCompatActivity {
    @BindView(R.id.cena_ukupna) TextView cena_text;

    @BindView(R.id.duznik_nalogodavac) EditText duznik_nalogodavac;
    @BindView(R.id.svrha_placanja) EditText svrha_placanja;
    @BindView(R.id.poverilac_primalac) EditText poverilac_primalac;
    @BindView(R.id.mesto_datum_prijema) EditText mesto_datum_prijema;
    @BindView(R.id.sifra_placanja) EditText sifra_placanja;
    @BindView(R.id.racun_duznika_nalogodavca) EditText racun_duznika_nalogodavca;
    @BindView(R.id.model) EditText model;
    @BindView(R.id.poziv_na_broj_zaduzenja) EditText poziv_na_broj_zaduzenja;
    @BindView(R.id.recun_poverioca_primaoca) EditText recun_poverioca_primaoca;
    @BindView(R.id.model2) EditText model2;
    @BindView(R.id.racun_na_broj_odobrenje) EditText racun_na_broj_odobrenje;
    @BindView(R.id.datum_valute) EditText datum_valute;
    @BindView(R.id.checkbox) CheckBox checkbox;

    @Inject Realm realm;

    Uplatnica uplatnica = new Uplatnica();
    RestAPI service;
    Activity activity = this;
    int ukupnaCena;
    String cena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_uplatnica);

        ButterKnife.bind(this);

        ((App) getApplication()).getComponent().inject(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.14:51854/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(RestAPI.class);

        Intent intent = getIntent();
        ukupnaCena = intent.getIntExtra("cena", 0);

        cena = String.valueOf(ukupnaCena);
        //Toast.makeText(this, as, Toast.LENGTH_SHORT).show();
        cena_text.setText(cena + " dinara");
    }

    @OnClick(R.id.posalji_uplatnicu)
    public void posalji() {


        String temp1 = duznik_nalogodavac.getText().toString();
        uplatnica.setDuznikNalogodavac(temp1);

        String temp2 = svrha_placanja.getText().toString();
        uplatnica.setSvrhaPlacanja(temp2);

        String temp3 = poverilac_primalac.getText().toString();
        uplatnica.setPoverilacPrimalac(temp3);

        String temp4 = mesto_datum_prijema.getText().toString();
        uplatnica.setMestoDatumPrijema(temp4);

        String temp5 = sifra_placanja.getText().toString();
        uplatnica.setSifraPlacanja(temp5);

        uplatnica.setCena(ukupnaCena);

        String temp6 = racun_duznika_nalogodavca.getText().toString();
        uplatnica.setRacunDuznikaNalogodavca(temp6);

        String temp7 = model.getText().toString();
        uplatnica.setModel(temp7);

        String temp8 = poziv_na_broj_zaduzenja.getText().toString();
        uplatnica.setPozivNaBrojZaduzenja(temp8);

        String temp9 = recun_poverioca_primaoca.getText().toString();
        uplatnica.setRecunPoveriocaPrimaoca(temp9);

        String temp10 = model2.getText().toString();
        uplatnica.setModel2(temp10);

        String temp11 = racun_na_broj_odobrenje.getText().toString();
        uplatnica.setRacunNaBrojOdobrenje(temp11);

        String temp12 = datum_valute.getText().toString();
        uplatnica.setDatumValute(temp12);

        boolean temp13 = checkbox.isChecked();
        uplatnica.setCheckbox(temp13);

//        Call<RecieveOrderModel> call = service.postOrder(uplatnica);
//        call.enqueue(new Callback<RecieveOrderModel>() {
//            @Override
//            public void onResponse(Call<RecieveOrderModel> call, Response<RecieveOrderModel> response) {
//                if (response.isSuccessful()) {
//                    RecieveOrderModel model = response.body();
//                    Toast toast = Toast.makeText(activity, "stiglo", Toast.LENGTH_SHORT);
//                    toast.show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<RecieveOrderModel> call, Throwable t) {
//                Toast toast = Toast.makeText(activity, "nije stiglo", Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });

        Call<Void> call = service.postOrder(uplatnica);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    //RecieveOrderModel model = response.body();
                    Toast toast = Toast.makeText(activity, "Uspesno poslato", Toast.LENGTH_SHORT);
                    toast.show();

                    realm.beginTransaction();
                    RealmResults<SpisakProizvoda> spisak = realm.where(SpisakProizvoda.class).findAll();

                    spisak.deleteAllFromRealm();
                    realm.commitTransaction();

                    Intent intent = new Intent(activity, HomeScreen.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast toast = Toast.makeText(activity, "Nije poslato", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}

