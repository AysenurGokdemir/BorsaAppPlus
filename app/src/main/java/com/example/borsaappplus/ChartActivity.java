package com.example.borsaappplus;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.borsaappplus.api.BorsaApi;
import com.example.borsaappplus.api.ClientApi;
import com.example.borsaappplus.model.ExampleChart;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChartActivity extends AppCompatActivity {

    public LineChart lineChart;
    public List<ExampleChart> examples;
    public Context context;
    String[] legendName={"Ceyrek Altın"};
    int[] colorClassArray=new int []{Color.GREEN,Color.RED,Color.YELLOW,Color.BLACK};
   /**
    *  ArrayList<String> loopList = new ArrayList<String>();
    */



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chart_view);

        lineChart=findViewById(R.id.line_chart);
        getExampleChart();

    }

   private void getExampleChart(){
       BorsaApi apiService= ClientApi.getRetrofit().create(BorsaApi.class);

       Call<ExampleChart> call=apiService.getResultAltinChart();
       call.enqueue(new Callback<ExampleChart>() {
           @Override
           public void onResponse(Call<ExampleChart> call, Response<ExampleChart> response) {


                   List<Entry> lineEntries = new ArrayList<>();
                   for (ExampleChart exampleChart : Collections.singletonList(response.body())) {
                       lineEntries.add(new Entry(1, exampleChart.getGun_bir().getBuy()));
                       lineEntries.add(new Entry(2, exampleChart.getGun_iki().getBuy()));
                       lineEntries.add(new Entry(3, exampleChart.getGun_uc().getBuy()));
                       lineEntries.add(new Entry(4, exampleChart.getGun_dort().getBuy()));
                       lineEntries.add(new Entry(5, exampleChart.getGun_bes().getBuy()));
                       lineEntries.add(new Entry(6, exampleChart.getGun_alti().getBuy()));
                       lineEntries.add(new Entry(7, exampleChart.getGun_yedi().getBuy()));
                   }


                   List<Entry> lineEntries2=new ArrayList<>();
               for (ExampleChart exampleChart :Collections.singletonList(response.body())) {
                   lineEntries2.add(new Entry( 1,exampleChart.getGun_bir().getSell()));
                   lineEntries2.add(new Entry( 2,exampleChart.getGun_iki().getSell()));
                   lineEntries2.add(new Entry( 3,exampleChart.getGun_uc().getSell()));
                   lineEntries2.add(new Entry( 4,exampleChart.getGun_dort().getSell()));
                   lineEntries2.add(new Entry( 5,exampleChart.getGun_bes().getSell()));
                   lineEntries2.add(new Entry( 6,exampleChart.getGun_alti().getSell()));
                   lineEntries2.add(new Entry( 7,exampleChart.getGun_yedi().getSell()));
               }

                        LineDataSet lineDataSet=new LineDataSet(lineEntries,"ALIŞ");
                        LineDataSet lineDataSet2=new LineDataSet(lineEntries2,"SATIŞ");

                       ArrayList<ILineDataSet> dataSets=new ArrayList<>();
                       dataSets.add(lineDataSet);
                       dataSets.add(lineDataSet2);

                       lineChart.setDrawGridBackground(true);
                       lineChart.setDrawBorders(true);
                       lineChart.setBorderColor(Color.BLACK);
                       lineChart.setBorderWidth(2);

                       Description description=new Description();
                       description.setText("BORSA RESULT");
                       description.setTextColor(Color.RED);
                       description.setTextSize(15);
                       lineChart.setDescription(description);

                       Legend legend=lineChart.getLegend();

                       legend.setEnabled(true);
                       legend.setFormSize(10);
                       legend.setFormToTextSpace(5);

                       LegendEntry[] legendEntries=new LegendEntry[1];

                       for(int i=0;i<legendEntries.length;i++){
                           LegendEntry entry=new LegendEntry();
                          // entry.formColor=colorClassArray[i];
                           entry.label=String.valueOf("Çeyrek Altin Alış");
                           legendEntries[i]=entry;
                       }
                       legend.setCustom(legendEntries);



               LegendEntry[] legendEntries2=new LegendEntry[1];

               for(int i=0;i<legendEntries2.length;i++){
                   LegendEntry entry2=new LegendEntry();
                   //entry2.formColor=colorClassArray[i];
                   entry2.label=String.valueOf("Çeyrek Altın Satış ve Alış");
                   legendEntries2[i]=entry2;
               }
               legend.setCustom(legendEntries2);
               LineData data=new LineData(dataSets);
               lineChart.animateXY(5000,4000, Easing.EasingOption.EaseInOutBounce,Easing.EasingOption.EaseInExpo);

               lineChart.setData(data);
               lineChart.invalidate();


                       // examples= Collections.singletonList(response.body());

                      /*for (int i=0; i<examples.size();i++){

                          System.out.println( "result"+examples.get(i).getCeyrekAltin().getSatis());

                      }*/
                  /* BarDataSet barDataSet=new BarDataSet(barEntries,"Altin");
                      barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

                   BarData barData=new BarData(barDataSet);
                   barData.setBarWidth(0.9f);

                   //barChart.setVisibility(View.VISIBLE);
                   barChart.animateX(5000);
                   barChart.setData(barData);
                   barChart.setFitBars(true);*/



               }

           @Override
           public void onFailure(Call<ExampleChart> call, Throwable t) {
               int x=0;
           }



       });

   }


}
