package org.vaadin.example.models;

public class Personel {
    private String tc;
    private String ad;
    private String soyad;

    public Personel(String tc, String ad, String soyad) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }
}
