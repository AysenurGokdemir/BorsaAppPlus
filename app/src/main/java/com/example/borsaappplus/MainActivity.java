package com.example.borsaappplus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.borsaappplus.adapter.BorsaAdapter;
import com.example.borsaappplus.api.BorsaApi;
import com.example.borsaappplus.api.ClientApi;
import com.example.borsaappplus.model.Example;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private BorsaAdapter borsaAdapter;
    private List<Example> borsaResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        getBorsaResultFromRestApi();

    }
    private void getBorsaResultFromRestApi(){
        BorsaApi apiService= ClientApi.getRetrofit().create(BorsaApi.class);

        Call<Example> call=apiService.getResult();
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                borsaResult= Collections.singletonList(response.body());
                borsaAdapter=new BorsaAdapter(getApplicationContext(),borsaResult);
                recyclerView.setAdapter(borsaAdapter);
                borsaAdapter.notifyDataSetChanged();

                int x=0;
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                int x=0;
            }
        });

    }
}
