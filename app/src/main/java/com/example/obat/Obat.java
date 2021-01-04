package com.example.obat;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
public class Obat implements Serializable {
    private String key;

    private String nama_obat;
    private String tipe_obat;
    private String desk_obat;

    public Obat() {

    }

    public Obat(String nama_obat, String tipe_obat, String desk_obat) {
        this.nama_obat = nama_obat;
        this.tipe_obat = tipe_obat;
        this.desk_obat = desk_obat;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getTipe_obat() {
        return tipe_obat;
    }

    public void setTipe_obat(String tipe_obat) {
        this.tipe_obat = tipe_obat;
    }

    public String getDesk_obat() {
        return desk_obat;
    }

    public void setDesk_obat(String desk_obat) {
        this.desk_obat = desk_obat;
    }

    @Override
    public String toString() {
        return " "+nama_obat+"\n" +
                " "+tipe_obat+"\n" +
                " "+desk_obat;
    }
}
