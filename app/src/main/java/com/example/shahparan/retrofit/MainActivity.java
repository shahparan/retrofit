package com.example.shahparan.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.shahparan.retrofit.adapter.RecycleViewAdapter;
import com.example.shahparan.retrofit.model.AndroidVersion;
import com.example.shahparan.retrofit.retrofit.ApiInterface;
import com.example.shahparan.retrofit.retrofit.RetrofitApiClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    RecyclerView recyclerView;
    RecycleViewAdapter recycleViewAdapter;

    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.myRecycleView);
    }

    public void showData(View view) {

        apiInterface = RetrofitApiClient.getRetrofit().create(ApiInterface.class);

        Call<ArrayList<AndroidVersion>> call = apiInterface.getAndroidVersion();

        call.enqueue(new Callback<ArrayList<AndroidVersion>>() {
            @Override
            public void onResponse(Call<ArrayList<AndroidVersion>> call, Response<ArrayList<AndroidVersion>> response) {

                if(response.code() == 200){

                    layoutManager = new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(layoutManager);
                    recycleViewAdapter = new RecycleViewAdapter(response.body());
                    recyclerView.setAdapter(recycleViewAdapter);
                   
                    Log.i("ValueIS",response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<AndroidVersion>> call, Throwable t) {
                Log.i("Error",t.toString());
            }
        });
    }
}
