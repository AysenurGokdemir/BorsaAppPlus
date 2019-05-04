package com.example.borsaappplus.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.borsaappplus.R;
import com.example.borsaappplus.model.ExampleChart;
import com.github.mikephil.charting.charts.LineChart;

import java.util.List;

public class BorsaChartAdapter extends RecyclerView.Adapter<BorsaChartAdapter.MyHolder> {

    public Context context;
    public List<ExampleChart> examples;

    public BorsaChartAdapter(Context context, List<ExampleChart> examples) {
        this.context = context;
        this.examples = examples;
    }

    @NonNull
    @Override
    public BorsaChartAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chart_view,parent,false);

        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public int getItemCount() { return examples.size(); }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

    }

    public  static  class MyHolder extends RecyclerView.ViewHolder{

            LineChart lineChart;

        public MyHolder(View view){
            super(view);
            lineChart=view.findViewById(R.id.line_chart);
        }

    }
}
