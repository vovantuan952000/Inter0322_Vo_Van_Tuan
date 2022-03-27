package models;

public class House extends Facility{
private String tieuchuanphong;
private int sotang;

    public House(String tendichvu, double dientichsudung, double chiphithue, int soluongnguoitoida, String kieuthue, String tieuchuanphong, int sotang) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }
}
