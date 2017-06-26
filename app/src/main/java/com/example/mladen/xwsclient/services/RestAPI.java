package com.example.mladen.xwsclient.services;

import com.example.mladen.xwsclient.model.RecieveOrderModel;
import com.example.mladen.xwsclient.model.SendOrderModel;
import com.example.mladen.xwsclient.model.Uplatnica;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RestAPI {

//    @POST("order")
//    Call<RecieveOrderModel> postOrder(@Body SendOrderModel sendOrderModel);

    @POST("order")
    Call<Void> postOrder(@Body Uplatnica sendUplatnica);

    @GET("izvod")
    Call<List<Uplatnica>> getIzvodi();
}
