package com.diozaas.listmakanan;

public class Makanan {

    int id, photo;
    String nama;
    String detail;

    public Makanan(int id, String nama, int photo, String detail) {
        this.id = id;
        this.photo = photo;
        this.nama = nama;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
