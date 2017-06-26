package com.example.mladen.xwsclient.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.model.RecieveOrderModel;
import com.example.mladen.xwsclient.model.SendOrderModel;
import com.example.mladen.xwsclient.services.RestAPI;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.addFirst)
    EditText edit1;

    @BindView(R.id.addSecond)
    EditText edit2;

    @BindView(R.id.addThird)
    EditText edit3;

    RestAPI service;

    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.22:51854/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(RestAPI.class);


    }

//    @OnClick(R.id.buttonSubmit) void sent() {
//        final SendOrderModel model = new SendOrderModel(
//                Integer.parseInt(edit1.getText().toString()),
//                Integer.parseInt(edit2.getText().toString()),
//                edit3.getText().toString()
//        );
//
//        Call<RecieveOrderModel> call = service.postOrder(model);
//        call.enqueue(new Callback<RecieveOrderModel>() {
//            @Override
//            public void onResponse(Call<RecieveOrderModel> call, Response<RecieveOrderModel> response) {
//                if (response.isSuccessful()) {
//                    RecieveOrderModel model = response.body();
//                    Toast toast = Toast.makeText(activity, "stiglo", Toast.LENGTH_SHORT);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<RecieveOrderModel> call, Throwable t) {
//                Toast toast = Toast.makeText(activity, "nije stiglo", Toast.LENGTH_SHORT);
//
//            }
//        });
//    }
}
