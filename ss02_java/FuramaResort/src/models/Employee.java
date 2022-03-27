package models;

import java.util.Date;

public class Employee extends Person {

    private String trinhdo;
    private String vitri;
    private Long luong;

    public Employee(int id, String hoten, Date ngaysinh, String gioitinh, String soCMND, String sodienthoai, String email, String trinhdo, String vitri, Long luong) {
        super(id, hoten, ngaysinh, gioitinh, soCMND, sodienthoai, email);
        this.trinhdo = trinhdo;
        this.vitri = vitri;
        this.luong = luong;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "trinhdo='" + trinhdo + '\'' +
                ", vitri='" + vitri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
