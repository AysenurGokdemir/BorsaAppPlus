package com.example.borsaappplus.model;

import com.google.gson.annotations.SerializedName;

public class Example {
    @SerializedName("altin")

    public BorsaResult borsaResult;
    @SerializedName("gr_altin")
    public Gr_AltinResult grAltinResult;
    @SerializedName("gumus")
    public Gumus gumus;
    @SerializedName("ata_cumhuriyet")
    public AtaCumhuriyet ataCumhuriyet;
    @SerializedName("ata_cumhuriyet_eski")
    public AtaCumhuriyetEski ataCumhuriyetEski;
    @SerializedName("ceyrek_altin")
    public CeyrekAltin ceyrekAltin;
    @SerializedName("eski_ceyrek_altin")
    public CeyrekAltinEski ceyrekAltinEski;
    @SerializedName("yarim_altin")
    public YarimAltin yarimAltin;
    @SerializedName("eski_yarim_altin")
    public YarimAltinEski yarimAltinEski;
    @SerializedName("tam_altin")
    public TamAltin tamAltin;
    @SerializedName("eski_tam_altin")
    public TamAltinEski tamAltinEski;
    @SerializedName("dolar")
    public Dolar dolar;
    @SerializedName("euro")
    public Euro euro;


    public Example(BorsaResult borsaResult, Gr_AltinResult grAltinResult, Gumus gumus, AtaCumhuriyet ataCumhuriyet, AtaCumhuriyetEski ataCumhuriyetEski, CeyrekAltin ceyrekAltin, CeyrekAltinEski ceyrekAltinEski, YarimAltin yarimAltin, YarimAltinEski yarimAltinEski, TamAltin tamAltin, TamAltinEski tamAltinEski, Dolar dolar, Euro euro) {
        this.borsaResult = borsaResult;
        this.grAltinResult = grAltinResult;
        this.gumus = gumus;
        this.ataCumhuriyet = ataCumhuriyet;
        this.ataCumhuriyetEski = ataCumhuriyetEski;
        this.ceyrekAltin = ceyrekAltin;
        this.ceyrekAltinEski = ceyrekAltinEski;
        this.yarimAltin = yarimAltin;
        this.yarimAltinEski = yarimAltinEski;
        this.tamAltin = tamAltin;
        this.tamAltinEski = tamAltinEski;
        this.dolar = dolar;
        this.euro = euro;
    }

    public BorsaResult getBorsaResult() {
        return borsaResult;
    }

    public Gr_AltinResult getGrAltinResult() {
        return grAltinResult;
    }

    public Gumus getGumus() {
        return gumus;
    }

    public AtaCumhuriyet getAtaCumhuriyet() {
        return ataCumhuriyet;
    }

    public AtaCumhuriyetEski getAtaCumhuriyetEski() {
        return ataCumhuriyetEski;
    }

    public CeyrekAltin getCeyrekAltin() {
        return ceyrekAltin;
    }

    public CeyrekAltinEski getCeyrekAltinEski() {
        return ceyrekAltinEski;
    }

    public YarimAltin getYarimAltin() {
        return yarimAltin;
    }

    public YarimAltinEski getYarimAltinEski() {
        return yarimAltinEski;
    }

    public TamAltin getTamAltin() {
        return tamAltin;
    }

    public TamAltinEski getTamAltinEski() {
        return tamAltinEski;
    }

    public Dolar getDolar() {
        return dolar;
    }

    public Euro getEuro() {
        return euro;
    }
}
