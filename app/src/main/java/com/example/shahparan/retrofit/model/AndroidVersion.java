package com.example.shahparan.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Shah Paran on 28-Mar-18.
 */

public class AndroidVersion {

    @SerializedName("ver")
    @Expose
    private String ver;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("api")
    @Expose
    private String api;

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "ver='" + ver + '\'' +
                ", name='" + name + '\'' +
                ", api='" + api + '\'' +
                '}';
    }

    public class Coord {

        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("lat")
        @Expose
        private Double lat;

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

    }
}
