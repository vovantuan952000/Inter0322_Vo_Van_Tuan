package models;

import java.sql.Date;

public abstract class  Facility {


    private String tendichvu;
    private double dientichsudung;
    private double chiphithue;
    private int soluongnguoitoida;
    private String kieuthue;

    public Facility(String tendichvu, double dientichsudung, double chiphithue, int soluongnguoitoida, String kieuthue) {
        this.tendichvu = tendichvu;
        this.dientichsudung = dientichsudung;
        this.chiphithue = chiphithue;
        this.soluongnguoitoida = soluongnguoitoida;
        this.kieuthue = kieuthue;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public double getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(double dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public double getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(double chiphithue) {
        this.chiphithue = chiphithue;
    }

    public int getSoluongnguoitoida() {
        return soluongnguoitoida;
    }

    public void setSoluongnguoitoida(int soluongnguoitoida) {
        this.soluongnguoitoida = soluongnguoitoida;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tendichvu='" + tendichvu + '\'' +
                ", dientichsudung=" + dientichsudung +
                ", chiphithue=" + chiphithue +
                ", soluongnguoitoida=" + soluongnguoitoida +
                ", kieuthue='" + kieuthue + '\'' +
                '}';
    }
}
