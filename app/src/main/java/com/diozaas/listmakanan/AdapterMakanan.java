package com.diozaas.listmakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.MakananViewHolder> {
    Context context;
    List<Makanan> listMakanan;

    public AdapterMakanan(Context context, List<Makanan> listMakanan) {
        this.context = context;
        this.listMakanan = listMakanan;
    }

    // onCreateViewHolder untuk set LayoutInflater
    @NonNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan,parent,false);
        View view = LayoutInflater.from(context).inflate(R.layout.item_grid,parent,false);
        return new MakananViewHolder(view);
    }

    // onBindViewHolder untuk Binding data yang diambil
    @Override
    public void onBindViewHolder(@NonNull MakananViewHolder holder, int position) {
        holder.nama.setText(listMakanan.get(position).nama);

//        holder.gambar.setImageResource(listMakanan.get(position).photo);
        Glide.with(context).load(listMakanan.get(position).getPhoto()).into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar;
        TextView nama;

        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.image_makanan);
            nama = itemView.findViewById(R.id.nama_makanan);
        }
    }
}
