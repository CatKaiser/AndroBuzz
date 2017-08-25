package com.geil.myapplication.activity;

import android.os.Build;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by CaptainStosha on 8/25/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceModel {

    @JsonProperty("Model")
    private String model;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("ClientId")
    private String clientId;

    public DeviceModel(String clientID){
        this.clientId = clientID;
        brand = Build.BRAND;
        model = Build.MODEL;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
