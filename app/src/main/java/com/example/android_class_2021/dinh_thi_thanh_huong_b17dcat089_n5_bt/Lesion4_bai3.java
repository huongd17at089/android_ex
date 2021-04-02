package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model.SanBong;
import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model.SanBongAdapter;

import java.util.ArrayList;

public class Lesion4_bai3 extends AppCompatActivity {
    private RecyclerView rv;
    private SanBongAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesion4_bai3);
        rv = findViewById(R.id.recyclerView);
        adapter = new SanBongAdapter();
        adapter.setData(initData());
        adapter.notifyDataSetChanged();
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<SanBong> initData(){
        ArrayList<SanBong> ls = new ArrayList<>();
        ls.add(new SanBong(1, "ten1", R.drawable.a67586673, "diachi1"));
        ls.add(new SanBong(2, "ten2", R.drawable.a67586673, "diachi2"));
        return ls;
    }
}