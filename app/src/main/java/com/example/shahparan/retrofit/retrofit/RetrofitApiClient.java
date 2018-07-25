package com.example.shahparan.retrofit.retrofit;

import java.security.PublicKey;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shah Paran on 28-Mar-18.
 */

public class RetrofitApiClient {

    public static final String BASE_URL = "http://shahparan.me/";
    public static Retrofit retrofit = null;

    private RetrofitApiClient(){}

    public static Retrofit getRetrofit() {

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
