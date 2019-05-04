package com.example.borsaappplus.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.borsaappplus.R;
import com.example.borsaappplus.model.Example;

import java.util.ArrayList;
import java.util.List;


//The adapter is a component that stands between the data model we want to show in our app UI and the UI component that renders this information.
// In other words, an adapter guides the way the information are shown in the UI.
// So if we want to display our contacts, we need an adapter for the RecyclerView.

public class BorsaAdapter extends RecyclerView.Adapter<BorsaAdapter.MyHolder> {

    public Context context;
    public List<Example> examples;

    public BorsaAdapter(Context applicationContext, ArrayList<Example> borsaResult) {
        this.context=applicationContext;
        this.examples=borsaResult;
    }

    public BorsaAdapter(Context context, List<Example> borsaResult) {
        this.context=context;
        this.examples=borsaResult;
    }
    //public List<BorsaResult> borsaResults=new ArrayList<BorsaResult>();
    //public List<OncekiKapanis> oncekiKapanis=new ArrayList<OncekiKapanis>();


   /* public BorsaAdapter(Context context,ArrayList<Example> models) {
        this.context = context;
        this.examples= models;

        //notifyDataSetChanged();

    }*/



    @NonNull
    @Override
    public BorsaAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listt_card_item,parent,false);

        //card_expand_item_view -> layout
        final MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }



    @Override
    public int getItemCount() {
        return examples.size();
    }



    @Override
    public void onBindViewHolder(@NonNull BorsaAdapter.MyHolder holder, int position) {



        holder.gr_alis.setText(examples.get(position).getGrAltinResult().getAlis());
        holder.gr_satis.setText(examples.get(position).getGrAltinResult().getSatis());
        holder.gr_tarih.setText(examples.get(position).getGrAltinResult().getTarih());
        holder.gr_onceki_kapanis_alis.setText(examples.get(position).getGrAltinResult().getOnceki_kapanis().getAlis());
        holder.gr_onceki_kapanis_satis.setText(examples.get(position).getGrAltinResult().getOnceki_kapanis().getSatis());
        holder.gr_onceki_kapanis_tarih.setText(examples.get(position).getGrAltinResult().getOnceki_kapanis().getTarih());

        holder.yarim_alis.setText(examples.get(position).getYarimAltin().getAlis());
        holder.yarim_satis.setText(examples.get(position).getYarimAltin().getSatis());
        holder.yarim_tarih.setText(examples.get(position).getYarimAltin().getTarih());
        holder.yarim_onceki_kapanis_alis.setText(examples.get(position).getYarimAltin().getOnceki_kapanis().getAlis());
        holder.yarim_onceki_kapanis_satis.setText(examples.get(position).getYarimAltin().getOnceki_kapanis().getSatis());
        holder.yarim_onceki_kapanis_tarih.setText(examples.get(position).getYarimAltin().getOnceki_kapanis().getTarih());

        holder.yarim_eski_alis.setText(examples.get(position).getYarimAltinEski().getAlis());
        holder.yarim_eski_satis.setText(examples.get(position).getYarimAltinEski().getSatis());
        holder.yarim_eski_tarih.setText(examples.get(position).getYarimAltinEski().getTarih());
        holder.yarim_eski_onceki_kapanis_alis.setText(examples.get(position).getYarimAltinEski().getOnceki_kapanis().getAlis());
        holder.yarim_eski_onceki_kapanis_satis.setText(examples.get(position).getYarimAltinEski().getOnceki_kapanis().getSatis());
        holder.yarim_eski_onceki_kapanis_tarih.setText(examples.get(position).getYarimAltinEski().getOnceki_kapanis().getTarih());

        holder.tam_alis.setText(examples.get(position).getTamAltin().getAlis());
        holder.tam_satis.setText(examples.get(position).getTamAltin().getSatis());
        holder.tam_tarih.setText(examples.get(position).getTamAltin().getTarih());
        holder.tam_onceki_kapanis_alis.setText(examples.get(position).getTamAltin().getOnceki_kapanis().getAlis());
        holder.tam_onceki_kapanis_satis.setText(examples.get(position).getTamAltin().getOnceki_kapanis().getSatis());
        holder.tam_onceki_kapanis_tarih.setText(examples.get(position).getTamAltin().getOnceki_kapanis().getTarih());

        holder.tam_eski_alis.setText(examples.get(position).getTamAltinEski().getAlis());
        holder.tam_eski_satis.setText(examples.get(position).getTamAltinEski().getSatis());
        holder.tam_eski_tarih.setText(examples.get(position).getTamAltinEski().getTarih());
        holder.tam_eski_onceki_kapanis_alis.setText(examples.get(position).getTamAltinEski().getOnceki_kapanis().getAlis());
        holder.tam_eski_onceki_kapanis_satis.setText(examples.get(position).getTamAltinEski().getOnceki_kapanis().getSatis());
        holder.tam_eski_onceki_kapanis_tarih.setText(examples.get(position).getTamAltinEski().getOnceki_kapanis().getTarih());

        holder.gumus_alis.setText(examples.get(position).getGumus().getAlis());
        holder.gumus_satis.setText(examples.get(position).getGumus().getSatis());
        holder.gumus_tarih.setText(examples.get(position).getGumus().getTarih());
        holder.gumus_onceki_kapanis_alis.setText(examples.get(position).getGumus().getOnceki_kapanis().getAlis());
        holder.gumus_onceki_kapanis_satis.setText(examples.get(position).getGumus().getOnceki_kapanis().getSatis());
        holder.gumus_onceki_kapanis_tarih.setText(examples.get(position).getGumus().getOnceki_kapanis().getTarih());

        holder.euro_alis.setText(examples.get(position).getEuro().getAlis());
        holder.euro_satis.setText(examples.get(position).getEuro().getSatis());
        holder.euro_tarih.setText(examples.get(position).getEuro().getTarih());
        holder.euro_onceki_kapanis_alis.setText(examples.get(position).getEuro().getOnceki_kapanis().getAlis());
        holder.euro_onceki_kapanis_satis.setText(examples.get(position).getEuro().getOnceki_kapanis().getSatis());
        holder.euro_onceki_kapanis_tarih.setText(examples.get(position).getEuro().getOnceki_kapanis().getTarih());

        holder.dolar_alis.setText(examples.get(position).getDolar().getAlis());
        holder.dolar_satis.setText(examples.get(position).getDolar().getSatis());
        holder.dolar_tarih.setText(examples.get(position).getDolar().getTarih());
        holder.dolar_onceki_kapanis_alis.setText(examples.get(position).getDolar().getOnceki_kapanis().getAlis());
        holder.dolar_onceki_kapanis_satis.setText(examples.get(position).getDolar().getOnceki_kapanis().getSatis());
        holder.dolar_onceki_kapanis_tarih.setText(examples.get(position).getDolar().getOnceki_kapanis().getTarih());

        holder.ceyrek_alis.setText(examples.get(position).getCeyrekAltin().getAlis());
        holder.ceyrek_satis.setText(examples.get(position).getCeyrekAltin().getSatis());
        holder.ceyrek_tarih.setText(examples.get(position).getCeyrekAltin().getTarih());
        holder.ceyrek_onceki_kapanis_alis.setText(examples.get(position).getCeyrekAltin().getOnceki_kapanis().getAlis());
        holder.ceyrek_onceki_kapanis_satis.setText(examples.get(position).getCeyrekAltin().getOnceki_kapanis().getSatis());
        holder.ceyrek_onceki_kapanis_tarih.setText(examples.get(position).getCeyrekAltin().getOnceki_kapanis().getTarih());

        holder.ceyrek_eski_alis.setText(examples.get(position).getCeyrekAltinEski().getAlis());
        holder.ceyrek_eski_satis.setText(examples.get(position).getCeyrekAltinEski().getSatis());
        holder.ceyrek_eski_tarih.setText(examples.get(position).getCeyrekAltinEski().getTarih());
        holder.ceyrek_eski_onceki_kapanis_alis.setText(examples.get(position).getCeyrekAltinEski().getOnceki_kapanis().getAlis());
        holder.ceyrek_eski_onceki_kapanis_satis.setText(examples.get(position).getCeyrekAltinEski().getOnceki_kapanis().getAlis());
        holder.ceyrek_eski_onceki_kapanis_tarih.setText(examples.get(position).getCeyrekAltinEski().getOnceki_kapanis().getAlis());

        holder.ata_alis.setText(examples.get(position).getAtaCumhuriyet().getAlis());
        holder.ata_satis.setText(examples.get(position).getAtaCumhuriyet().getSatis());
        holder.ata_tarih.setText(examples.get(position).getAtaCumhuriyet().getTarih());
        holder.ata_onceki_kapanis_alis.setText(examples.get(position).getAtaCumhuriyet().getOnceki_kapanis().getAlis());
        holder.ata_onceki_kapanis_satis.setText(examples.get(position).getAtaCumhuriyet().getOnceki_kapanis().getSatis());
        holder.ata_onceki_kapanis_tarih.setText(examples.get(position).getAtaCumhuriyet().getOnceki_kapanis().getTarih());

        holder.ata_eski_alis.setText(examples.get(position).getAtaCumhuriyetEski().getAlis());
        holder.ata_eski_satis.setText(examples.get(position).getAtaCumhuriyetEski().getSatis());
        holder.ata_eski_tarih.setText(examples.get(position).getAtaCumhuriyetEski().getTarih());
        holder.ata_eski_onceki_kapanis_alis.setText(examples.get(position).getAtaCumhuriyetEski().getOnceki_kapanis().getAlis());
        holder.ata_eski_onceki_kapanis_satis.setText(examples.get(position).getAtaCumhuriyetEski().getOnceki_kapanis().getSatis());
        holder.ata_eski_onceki_kapanis_tarih.setText(examples.get(position).getAtaCumhuriyetEski().getOnceki_kapanis().getTarih());







    }
    public static  class  MyHolder extends  RecyclerView.ViewHolder{
        private  TextView tv_altin,alis,satis,tarih,onceki_kapanis,onceki_kapanis_alis,onceki_kapanis_satis,onceki_kapanis_tarih,
                gr_alis,gr_satis,gr_tarih,gr_onceki_kapanis,gr_onceki_kapanis_alis,gr_onceki_kapanis_satis,gr_onceki_kapanis_tarih,
                yarim_alis,yarim_satis,yarim_tarih,yarim_onceki_kapanis,yarim_onceki_kapanis_alis,yarim_onceki_kapanis_satis,yarim_onceki_kapanis_tarih,
                yarim_eski_alis,yarim_eski_satis,yarim_eski_tarih,yarim_eski_onceki_kapanis,yarim_eski_onceki_kapanis_alis,yarim_eski_onceki_kapanis_satis,yarim_eski_onceki_kapanis_tarih,
                tam_alis,tam_satis,tam_tarih,tam_onceki_kapanis,tam_onceki_kapanis_alis,tam_onceki_kapanis_satis,tam_onceki_kapanis_tarih,
                tam_eski_alis,tam_eski_satis,tam_eski_tarih,tam_eski_onceki_kapanis,tam_eski_onceki_kapanis_alis,tam_eski_onceki_kapanis_satis,tam_eski_onceki_kapanis_tarih,
                gumus_alis,gumus_satis,gumus_tarih,gumus_onceki_kapanis_alis,gumus_onceki_kapanis_satis,gumus_onceki_kapanis_tarih,
                euro_alis,euro_satis,euro_tarih,euro_onceki_kapanis,euro_onceki_kapanis_alis,euro_onceki_kapanis_satis,euro_onceki_kapanis_tarih,
                dolar_alis,dolar_satis,dolar_tarih,dolar_onceki_kapanis,dolar_onceki_kapanis_alis,dolar_onceki_kapanis_satis,dolar_onceki_kapanis_tarih,
                ceyrek_alis,ceyrek_satis,ceyrek_tarih,ceyrek_onceki_kapanis,ceyrek_onceki_kapanis_alis,ceyrek_onceki_kapanis_satis,ceyrek_onceki_kapanis_tarih,
                ceyrek_eski_alis,ceyrek_eski_satis,ceyrek_eski_tarih,ceyrek_eski_onceki_kapanis,ceyrek_eski_onceki_kapanis_alis,ceyrek_eski_onceki_kapanis_satis,ceyrek_eski_onceki_kapanis_tarih,
                ata_alis,ata_satis,ata_tarih,ata_onceki_kapanis,ata_onceki_kapanis_alis,ata_onceki_kapanis_satis,ata_onceki_kapanis_tarih,
                ata_eski_alis,ata_eski_satis,ata_eski_tarih,ata_eski_onceki_kapanis,ata_eski_onceki_kapanis_alis,ata_eski_onceki_kapanis_satis,ata_eski_onceki_kapanis_tarih;
        public MyHolder(View itemView) {
            super(itemView);
           // tv_altin=itemView.findViewById(R.id.altin);


            gr_alis=itemView.findViewById(R.id.gr_alis);
            gr_satis=itemView.findViewById(R.id.gr_satis);
            gr_tarih=itemView.findViewById(R.id.gr_tarih);
            gr_onceki_kapanis_alis=itemView.findViewById(R.id.gr_onceki_kapanis_alis);
            gr_onceki_kapanis_satis=itemView.findViewById(R.id.gr_onceki_kapanis_satis);
            gr_onceki_kapanis_tarih=itemView.findViewById(R.id.gr_onceki_kapanis_tarih);

            yarim_alis=itemView.findViewById(R.id.yarim_alis);
            yarim_satis=itemView.findViewById(R.id.yarim_satis);
            yarim_tarih=itemView.findViewById(R.id.yarim_tarih);
            yarim_onceki_kapanis_alis=itemView.findViewById(R.id.yarim_onceki_kapanis_alis);
            yarim_onceki_kapanis_satis=itemView.findViewById(R.id.yarim_onceki_kapanis_satis);
            yarim_onceki_kapanis_tarih=itemView.findViewById(R.id.yarim_onceki_kapanis_tarih);

            yarim_eski_alis=itemView.findViewById(R.id.yEski_alis);
            yarim_eski_satis=itemView.findViewById(R.id.yEski_satis);
            yarim_eski_tarih=itemView.findViewById(R.id.yEski_tarih);
            yarim_eski_onceki_kapanis_alis=itemView.findViewById(R.id.yEski_onceki_kapanis_alis);
            yarim_eski_onceki_kapanis_satis=itemView.findViewById(R.id.yEski_onceki_kapanis_satis);
            yarim_eski_onceki_kapanis_tarih=itemView.findViewById(R.id.yEski_onceki_kapanis_tarih);

            tam_alis=itemView.findViewById(R.id.tam_alis);
            tam_satis=itemView.findViewById(R.id.tam_satis);
            tam_tarih=itemView.findViewById(R.id.tam_tarih);
            tam_onceki_kapanis_alis=itemView.findViewById(R.id.tam_onceki_kapanis_alis);
            tam_onceki_kapanis_satis=itemView.findViewById(R.id.tam_onceki_kapanis_satis);
            tam_onceki_kapanis_tarih=itemView.findViewById(R.id.tam_onceki_kapanis_tarih);

            tam_eski_alis=itemView.findViewById(R.id.tEski_alis);
            tam_eski_satis=itemView.findViewById(R.id.tEski_satis);
            tam_eski_tarih=itemView.findViewById(R.id.tEski_tarih);
            tam_eski_onceki_kapanis_alis=itemView.findViewById(R.id.tEski_onceki_kapanis_alis);
            tam_eski_onceki_kapanis_satis=itemView.findViewById(R.id.tEski_onceki_kapanis_satis);
            tam_eski_onceki_kapanis_tarih=itemView.findViewById(R.id.tEski_onceki_kapanis_tarih);

            gumus_alis=itemView.findViewById(R.id.gumus_alis);
            gumus_satis=itemView.findViewById(R.id.gumus_satis);
            gumus_tarih=itemView.findViewById(R.id.gumus_tarih);
            gumus_onceki_kapanis_alis=itemView.findViewById(R.id.gumus_onceki_kapanis_alis);
            gumus_onceki_kapanis_satis=itemView.findViewById(R.id.gumus_onceki_kapanis_satis);
            gumus_onceki_kapanis_tarih=itemView.findViewById(R.id.gumus_onceki_kapanis_tarih);

            euro_alis=itemView.findViewById(R.id.euro_alis);
            euro_satis=itemView.findViewById(R.id.euro_satis);
            euro_tarih=itemView.findViewById(R.id.euro_tarih);
            euro_onceki_kapanis_alis=itemView.findViewById(R.id.euro_onceki_kapanis_alis);
            euro_onceki_kapanis_satis=itemView.findViewById(R.id.euro_onceki_kapanis_satis);
            euro_onceki_kapanis_tarih=itemView.findViewById(R.id.euro_onceki_kapanis_tarih);

            dolar_alis=itemView.findViewById(R.id.dolar_alis);
            dolar_satis=itemView.findViewById(R.id.dolar_satis);
            dolar_tarih=itemView.findViewById(R.id.dolar_tarih);
            dolar_onceki_kapanis_alis=itemView.findViewById(R.id.dolar_onceki_kapanis_alis);
            dolar_onceki_kapanis_satis=itemView.findViewById(R.id.dolar_onceki_kapanis_satis);
            dolar_onceki_kapanis_tarih=itemView.findViewById(R.id.dolar_onceki_kapanis_tarih);

            ceyrek_alis=itemView.findViewById(R.id.ceyrek_alis);
            ceyrek_satis=itemView.findViewById(R.id.ceyrek_satis);
            ceyrek_tarih=itemView.findViewById(R.id.ceyrek_tarih);
            ceyrek_onceki_kapanis_alis=itemView.findViewById(R.id.ceyrek_onceki_kapanis_alis);
            ceyrek_onceki_kapanis_satis=itemView.findViewById(R.id.ceyrek_onceki_kapanis_satis);
            ceyrek_onceki_kapanis_tarih=itemView.findViewById(R.id.ceyrek_onceki_kapanis_tarih);

            ceyrek_eski_alis=itemView.findViewById(R.id.cEski_alis);
            ceyrek_eski_satis=itemView.findViewById(R.id.cEski_satis);
            ceyrek_eski_tarih=itemView.findViewById(R.id.cEski_tarih);
            ceyrek_eski_onceki_kapanis_alis=itemView.findViewById(R.id.cEski_onceki_kapanis_alis);
            ceyrek_eski_onceki_kapanis_satis=itemView.findViewById(R.id.cEski_onceki_kapanis_satis);
            ceyrek_eski_onceki_kapanis_tarih=itemView.findViewById(R.id.cEski_onceki_kapanis_tarih);

            ata_alis=itemView.findViewById(R.id.ata_alis);
            ata_satis=itemView.findViewById(R.id.ata_satis);
            ata_tarih=itemView.findViewById(R.id.ata_tarih);
            ata_onceki_kapanis_alis=itemView.findViewById(R.id.ata_onceki_kapanis_alis);
            ata_onceki_kapanis_satis=itemView.findViewById(R.id.ata_onceki_kapanis_satis);
            ata_onceki_kapanis_tarih=itemView.findViewById(R.id.ata_onceki_kapanis_tarih);

            ata_eski_alis=itemView.findViewById(R.id.ataEski_alis);
            ata_eski_satis=itemView.findViewById(R.id.ataEski_satis);
            ata_eski_tarih=itemView.findViewById(R.id.ata_tarih);
            ata_eski_onceki_kapanis_alis=itemView.findViewById(R.id.ataEski_onceki_kapanis_alis);
            ata_eski_onceki_kapanis_satis=itemView.findViewById(R.id.ataEski_onceki_kapanis_satis);
            ata_eski_onceki_kapanis_tarih=itemView.findViewById(R.id.ataEski_onceki_kapanis_tarih);




        }


    }
}
