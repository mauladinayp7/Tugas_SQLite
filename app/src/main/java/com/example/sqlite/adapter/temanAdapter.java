package com.example.sqlite.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sqlite.R;
import com.example.sqlite.database.teman;

import java.util.ArrayList;

public class temanAdapter extends RecyclerView.Adapter<temanAdapter.temanViewHolder> {
    private ArrayList<teman> listData;

    public temanAdapter(ArrayList<teman> listData) {
        this.listData = listData;
    }

    @Override
    public temanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInf = LayoutInflater.from(parent.getContext());
        View view = layoutInf.inflate(R.layout.row_data_teman,parent, false);
        return new temanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull temanViewHolder holder, int position) {
        String nm,tlp;

        nm = listData.get(position).getNama();
        tlp = listData.get(position).getTelpon();

        holder.namaTxt.setTextColor(Color.BLUE);
        holder.namaTxt.setTextSize(20);
        holder.namaTxt.setText(nm);
        holder.telponTxt.setText(tlp);
    }

    @Override
    public int getItemCount() {
        return listData !=null ? listData.size() : 0;
    }

    public class temanViewHolder extends RecyclerView.ViewHolder {
        private CardView cardku;
        private TextView namaTxt,telponTxt;
        public temanViewHolder(View view) {
            super(view);
            cardku = (CardView) view.findViewById(R.id.kartuku);
            namaTxt = (TextView) view.findViewById(R.id.textNama);
            telponTxt = (TextView) view.findViewById(R.id.textTelpon);

        }
    }
}
