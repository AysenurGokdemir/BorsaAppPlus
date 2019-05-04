package com.example.borsaappplus.model;

import com.google.gson.annotations.SerializedName;

public class OncekiKapanis {
    @SerializedName("alis")

    public String alis;
    @SerializedName("satis")

    public String satis;
    @SerializedName("tarih")

    public String tarih;

    public OncekiKapanis(String alis, String satis, String tarih) {
        this.alis = alis;
        this.satis = satis;
        this.tarih = tarih;
    }

    public String getAlis() {
        return alis;
    }

    public void setAlis(String alis) {
        this.alis = alis;
    }

    public String getSatis() {
        return satis;
    }

    public void setSatis(String satis) {
        this.satis = satis;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}
