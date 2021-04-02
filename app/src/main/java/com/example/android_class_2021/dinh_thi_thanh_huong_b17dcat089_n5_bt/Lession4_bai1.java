package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model.NhanVien;
import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model.NvAdapter;

import java.util.ArrayList;

public class Lession4_bai1 extends AppCompatActivity {

    private EditText txtId, txtName;
    private Button btnAdd;
    private ListView listV;
    private NvAdapter adapter;
    private RadioGroup rg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession4_bai1);
        initView();
        btnAdd.setOnClickListener(this::addNV);
    }

    private void initView() {
        txtId = findViewById(R.id.txt_masv);
        txtName = findViewById(R.id.txt_name);
        btnAdd  = findViewById(R.id.btn_add);
        listV = findViewById(R.id.lv_nv);
        rg = findViewById(R.id.rg);



        ArrayList<NhanVien> ls = new ArrayList<NhanVien>();
        ls.add(new NhanVien("nv1", "ten1", "nu"));
        ls.add(new NhanVien("nv2", "ten2", "nam"));
        adapter = new NvAdapter( ls);
        listV.setAdapter(adapter); 
        adapter.notifyDataSetChanged();
    }

    public void addNV(View v){
        String id = txtId.getText().toString();
        String name = txtName.getText().toString();
        int selectedId = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(selectedId);
        String gt = rb.getText().toString();
        ArrayList<NhanVien> ls = adapter.getLs();
        ls.add(new NhanVien(id, name,gt));
        adapter.notifyDataSetChanged();
    }

    public void delNV(View view) {
    }
}