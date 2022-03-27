package models;

public class Room extends Facility {
    private String dichvumienphidikem;

    public Room(String tendichvu, double dientichsudung, double chiphithue, int soluongnguoitoida, String kieuthue, String dichvumienphidikem) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue);
        this.dichvumienphidikem = dichvumienphidikem;
    }

    public String getDichvumienphidikem() {
        return dichvumienphidikem;
    }

    public void setDichvumienphidikem(String dichvumienphidikem) {
        this.dichvumienphidikem = dichvumienphidikem;
    }
}
