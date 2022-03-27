package models;

public class Villa extends Facility {
    private String tieuchuanphong;
    private double dientichhoboi;
    private int sotang;

    public Villa(String tendichvu, double dientichsudung, double chiphithue, int soluongnguoitoida, String kieuthue, String tieuchuanphong, double dientichhoboi, int sotang) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.dientichhoboi = dientichhoboi;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public double getDientichhoboi() {
        return dientichhoboi;
    }

    public void setDientichhoboi(double dientichhoboi) {
        this.dientichhoboi = dientichhoboi;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }
}
