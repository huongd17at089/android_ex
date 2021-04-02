package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.R;

import java.util.ArrayList;

public class NvAdapter extends BaseAdapter {
    private ArrayList<NhanVien> ls;
//    private Activity context;


    public NvAdapter(ArrayList<NhanVien> ls) {
        this.ls = ls;
//        this.context = context;
    }

    @Override
    public int getCount() {
        if( ls != null)
            return ls.size();
        return 0;
    }

    @Override
    public NhanVien getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (convertView == null) {
            v = View.inflate(parent.getContext(), R.layout.lession4_bai1_item, null);
        } else v = convertView;

        ImageView imgV = v.findViewById(R.id.img_item);
        TextView txtV = v.findViewById(R.id.txt_item);
        NhanVien nv = ls.get(position);
        imgV.setImageResource(nv.getImg());
        txtV.setText(nv.toString());
        return v;

    }

    public NhanVien getNV(int p){
        return ls.get(p);
    }

    public ArrayList<NhanVien> getLs() {
        return ls;
    }

    public void addItem(NhanVien nv){
        if(!ls.contains(nv))
            ls.add(nv);
    }

    public void delItem(int p){ls.remove(p);}

//    public void updateItem(NhanVien nv){
//        int ind = ls.indexOf(nv);
//        ls.set(ind, nv);
//
//    }



}
