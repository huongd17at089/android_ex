package com.example.android_class_2021.dinh_thi_thanh_huong_b17dcat089_n5_bt.model;

public class SanBong {

    private int id;
    private String ten;
    private int img;
    private String diaChi;

    public SanBong() {
    }

    public SanBong(int id, String ten, int img, String diaChi) {
        this.id = id;
        this.ten = ten;
        this.img = img;
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
