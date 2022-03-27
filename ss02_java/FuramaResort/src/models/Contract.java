package models;

public class Contract {
    private int idhopdong;
    private int idbooking;
    private double sotiencoc;
    private long tongsotienthanhtoan;
    private int idkhachhang;

    public Contract(int idhopdong, int idbooking, double sotiencoc, long tongsotienthanhtoan, int idkhachhang) {
        this.idhopdong = idhopdong;
        this.idbooking = idbooking;
        this.sotiencoc = sotiencoc;
        this.tongsotienthanhtoan = tongsotienthanhtoan;
        this.idkhachhang = idkhachhang;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }

    public int getIdbooking() {
        return idbooking;
    }

    public void setIdbooking(int idbooking) {
        this.idbooking = idbooking;
    }

    public double getSotiencoc() {
        return sotiencoc;
    }

    public void setSotiencoc(double sotiencoc) {
        this.sotiencoc = sotiencoc;
    }

    public long getTongsotienthanhtoan() {
        return tongsotienthanhtoan;
    }

    public void setTongsotienthanhtoan(long tongsotienthanhtoan) {
        this.tongsotienthanhtoan = tongsotienthanhtoan;
    }

    public int getIdkhachhang() {
        return idkhachhang;
    }

    public void setIdkhachhang(int idkhachhang) {
        this.idkhachhang = idkhachhang;
    }
}
