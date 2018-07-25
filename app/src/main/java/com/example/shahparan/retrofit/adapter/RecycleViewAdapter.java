package com.example.shahparan.retrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shahparan.retrofit.R;
import com.example.shahparan.retrofit.model.AndroidVersion;

import java.util.ArrayList;

/**
 * Created by Shah Paran on 30-Mar-18.
 */

public class RecycleViewAdapter extends
        RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    ArrayList<AndroidVersion> androidVersions = new ArrayList<>();

    AndroidVersion androidVersion;

    public RecycleViewAdapter(ArrayList<AndroidVersion> androidVersions) {
        this.androidVersions = androidVersions;
    }

    @Override
    public RecycleViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapter.MyViewHolder holder, int position) {

        androidVersion = androidVersions.get(position);

        holder.ver.setText(androidVersion.getVer().toString());
        holder.name.setText(androidVersion.getName().toString());
        holder.api.setText(androidVersion.getApi().toString());

    }

    @Override
    public int getItemCount() {
        return androidVersions.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ver;
        TextView name;
        TextView api;

        public MyViewHolder(View itemView) {
            super(itemView);
            ver = itemView.findViewById(R.id.ver);
            name = itemView.findViewById(R.id.name);
            api = itemView.findViewById(R.id.apiLevel);
        }
    }
}
