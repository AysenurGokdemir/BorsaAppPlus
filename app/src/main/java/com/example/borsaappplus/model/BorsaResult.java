package com.example.borsaappplus.model;

import com.google.gson.annotations.SerializedName;

public class BorsaResult {
/*
*
* https://stackoverflow.com/questions/34752200/gson-expose-vs-serializedname
*
* */


    @SerializedName("alis")
    public String alis;
    @SerializedName("satis")
    public String satis;
    @SerializedName("tarih")
    public String tarih;
    @SerializedName("onceki_kapanis")
    public OncekiKapanis onceki_kapanis;


    public BorsaResult(String alis, String satis, String tarih,OncekiKapanis onceki_kapanis) {

        this.alis = alis;
        this.satis = satis;
        this.tarih = tarih;
        this.onceki_kapanis = onceki_kapanis;

        /*onceki_kapanis.alis=o_alis;
        onceki_kapanis.satis=o_satis;
        onceki_kapanis.tarih=o_tarih;*/
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
}//POJO plain old java object
