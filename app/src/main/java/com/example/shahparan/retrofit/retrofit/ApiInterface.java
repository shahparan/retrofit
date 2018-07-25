package com.example.shahparan.retrofit.retrofit;

import com.example.shahparan.retrofit.model.AndroidVersion;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Shah Paran on 28-Mar-18.
 */

public interface ApiInterface {

    @GET("st/getAndroidAllVersionList.php")
    Call<ArrayList<AndroidVersion>> getAndroidVersion();
}
