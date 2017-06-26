package com.example.mladen.xwsclient.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.adapter.IzvodAdapter;
import com.example.mladen.xwsclient.model.Uplatnica;
import com.example.mladen.xwsclient.services.RestAPI;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DobaviIzvod extends AppCompatActivity {
    RestAPI service;
    Activity activity = this;
    @BindView(R.id.list_id) ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobavi_izvod);

        ButterKnife.bind(this);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.14:51854/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(RestAPI.class);

        Call<List<Uplatnica>> call = service.getIzvodi();
        call.enqueue(new Callback<List<Uplatnica>>() {
            @Override
            public void onResponse(Call<List<Uplatnica>> call, Response<List<Uplatnica>> response) {
                if(response.isSuccessful()) {
                    List<Uplatnica> lista = response.body();

                    IzvodAdapter adapter = new IzvodAdapter(activity, lista);
                    listView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Uplatnica>> call, Throwable t) {

            }
        });
    }
}
