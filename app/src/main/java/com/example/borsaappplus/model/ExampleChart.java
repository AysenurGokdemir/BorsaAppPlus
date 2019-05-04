package com.example.borsaappplus.model;

import com.google.gson.annotations.SerializedName;

public class ExampleChart {

    @SerializedName("2347")
    private GunBir gun_bir;
    @SerializedName("2348")
    private GunIki gun_iki;
    @SerializedName("2349")
    private GunUc gun_uc;
    @SerializedName("2350")
    private GunDort gun_dort;
    @SerializedName("2351")
    private GunBes gun_bes;
    @SerializedName("2352")
    private GunAlti gun_alti;
    @SerializedName("2353")
    private GunYedi gun_yedi;
    @SerializedName("name")
    private String name;
    @SerializedName("start")
    private String start;

    public ExampleChart(GunBir gun_bir, GunIki gun_iki, GunUc gun_uc, GunDort gun_dort,
                        GunBes gun_bes, GunAlti gun_alti, GunYedi gun_yedi, String name, String start)
    {
        this.gun_bir = gun_bir;
        this.gun_iki = gun_iki;
        this.gun_uc = gun_uc;
        this.gun_dort = gun_dort;
        this.gun_bes = gun_bes;
        this.gun_alti = gun_alti;
        this.gun_yedi = gun_yedi;
        this.name = name;
        this.start = start;
    }

    public GunBir getGun_bir() {
        return gun_bir;
    }

    public void setGun_bir(GunBir gun_bir) {
        this.gun_bir = gun_bir;
    }

    public GunIki getGun_iki() {
        return gun_iki;
    }

    public void setGun_iki(GunIki gun_iki) {
        this.gun_iki = gun_iki;
    }

    public GunUc getGun_uc() {
        return gun_uc;
    }

    public void setGun_uc(GunUc gun_uc) {
        this.gun_uc = gun_uc;
    }

    public GunDort getGun_dort() {
        return gun_dort;
    }

    public void setGun_dort(GunDort gun_dort) {
        this.gun_dort = gun_dort;
    }

    public GunBes getGun_bes() {
        return gun_bes;
    }

    public void setGun_bes(GunBes gun_bes) {
        this.gun_bes = gun_bes;
    }

    public GunAlti getGun_alti() {
        return gun_alti;
    }

    public void setGun_alti(GunAlti gun_alti) {
        this.gun_alti = gun_alti;
    }

    public GunYedi getGun_yedi() {
        return gun_yedi;
    }

    public void setGun_yedi(GunYedi gun_yedi) {
        this.gun_yedi = gun_yedi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
