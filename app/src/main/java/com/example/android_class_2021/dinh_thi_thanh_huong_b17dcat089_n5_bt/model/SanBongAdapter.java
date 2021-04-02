package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.R;

import java.util.ArrayList;

public class SanBongAdapter extends RecyclerView.Adapter<SanBongAdapter.SanBongHolder> {

    ArrayList<SanBong> ls;

    public SanBongAdapter(ArrayList<SanBong> ls) {
        this.ls = ls;
    }

    public SanBongAdapter() {
    }

    @NonNull
    @Override
    public SanBongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lesion4_bai3_card, parent, false);
        return new SanBongHolder(v);
    }

    @Override
    public int getItemCount() {
        if(ls != null)
            return ls.size();
        return 0;
    }

    public void setData(ArrayList<SanBong> ls){
        this.ls = ls;
    }

    @Override
    public void onBindViewHolder(@NonNull SanBongHolder holder, int position) {
        SanBong sb = ls.get(position);
        if( sb == null)
            return;
        holder.txtDiaChi.setText(sb.getDiaChi());
        holder.txtTen.setText(sb.getTen());
        holder.imgSan.setImageResource(sb.getImg());
        holder.imgTen.setImageResource(R.drawable.a67586673);
        holder.imgDiaChi.setImageResource(R.drawable.a67586673);
    }

    @Override
    public long getItemId(int position) {
        return ls.get(position).getId();
    }

    public class SanBongHolder extends RecyclerView.ViewHolder{
        ImageView imgSan, imgTen, imgDiaChi;
        TextView txtTen, txtDiaChi;
        public SanBongHolder(@NonNull View v) {
            super(v);
            imgSan = v.findViewById(R.id.img_san);
            imgTen = v.findViewById(R.id.img_ten);
            imgDiaChi = v.findViewById(R.id.img_diachi);
            txtTen = v.findViewById(R.id.txt_ten);
            txtDiaChi = v.findViewById(R.id.txt_diachi);
        }


    }
}
