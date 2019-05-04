package com.example.borsaappplus.model;

import com.google.gson.annotations.SerializedName;

public class TamAltin {
    @SerializedName("alis")
    public String alis;
    @SerializedName("satis")
    public String satis;
    @SerializedName("tarih")
    public String tarih;
    @SerializedName("onceki_kapanis")
    public OncekiKapanis onceki_kapanis;

    public TamAltin(String alis, String satis, String tarih, OncekiKapanis onceki_kapanis) {
        this.alis = alis;
        this.satis = satis;
        this.tarih = tarih;
        this.onceki_kapanis = onceki_kapanis;
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

    public OncekiKapanis getOnceki_kapanis() {
        return onceki_kapanis;
    }

    public void setOnceki_kapanis(OncekiKapanis onceki_kapanis) {
        this.onceki_kapanis = onceki_kapanis;
    }
}
