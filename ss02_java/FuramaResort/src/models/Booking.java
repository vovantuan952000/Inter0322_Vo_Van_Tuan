package models;

import java.util.Date;

public class Booking {

    private int mabooking;
    private Date ngaybatdau;
    private Date ngayketthuc;
    private int idkhachhang;
    private String tendichvu;
    private String loaidichvu;

    public Booking(int mabooking, Date ngaybatdau, Date ngayketthuc, int idkhachhang, String tendichvu, String loaidichvu) {
        this.mabooking = mabooking;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
        this.idkhachhang = idkhachhang;
        this.tendichvu = tendichvu;
        this.loaidichvu= loaidichvu;
    }

    public int getMabooking() {
        return mabooking;
    }

    public void setMabooking(int mabooking) {
        this.mabooking = mabooking;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public int getIdkhachhang() {
        return idkhachhang;
    }

    public void setIdkhachhang(int idkhachhang) {
        this.idkhachhang = idkhachhang;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public String getLoaidichvu() {
        return loaidichvu;
    }

    public void setLoaidichvu(String loaidichvu) {
        this.loaidichvu = loaidichvu;
    }
}
