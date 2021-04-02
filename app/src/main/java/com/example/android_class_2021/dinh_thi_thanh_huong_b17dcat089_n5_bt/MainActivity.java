package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
//        sp = findViewById(R.id.spinner);
//        String[] s = getResources().getStringArray(R.array.country);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.abc, s);
//        adapter.setDropDownViewResource(R.layout.bcd);
//        sp.setAdapter(adapter);
    }
}