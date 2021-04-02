package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.R;

import java.util.Objects;

public class NhanVien {
    private String ma;
    private String ten;
    private String gioiTinh;
    private int img;

    public NhanVien(String ma, String ten, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        img = R.drawable.a67586673;
    }

    public NhanVien(String ma, String ten, String gioiTinh, int img) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return  ma + '\'' +
                "-'" + ten + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return ma.equals(nhanVien.ma);
    }

}
