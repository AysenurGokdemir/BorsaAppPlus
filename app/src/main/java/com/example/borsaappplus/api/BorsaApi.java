package com.example.borsaappplus.api;

import com.example.borsaappplus.model.Example;
import com.example.borsaappplus.model.ExampleChart;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BorsaApi {
    @GET("json/all_prices.json?=1548332164791")
    Call<Example> getResult();

        // Euro Chart

    @GET("grafik_ons.asp?islem=grafik&id=grafik_euro&donem=1&tur=Euro&banka=euro&time=11.02.2019+03:28:23")
    Call<List<ExampleChart>> getResultEuroChart();

        //Dolar Chart

    @GET("grafik_ons.asp?islem=grafik&id=grafik_dolar&donem=1&tur=Dolar&banka=dolar&time=12.02.2019+03:28:22")
    Call<List<ExampleChart>> getResultDolarChart();

        //Altin Chart

    @GET("/json/charts/ceyrek_altin.json?_=1550772385161")
    Call<ExampleChart> getResultAltinChart();
}
