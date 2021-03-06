package com.example.borsaappplus.model;

import com.google.gson.annotations.SerializedName;

public class GunAlti {
    @SerializedName("buy")
    private float buy;

    @SerializedName("sell")
    private float sell;

    public GunAlti(float buy, float sell) {
        this.buy = buy;
        this.sell = sell;
    }

    public float getBuy() {
        return buy;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }
}
