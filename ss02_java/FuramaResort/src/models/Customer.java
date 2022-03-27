package models;

import java.util.Date;

public class Customer extends Person {

    private String loiakhach;
    private String diachi;

    public Customer(int id, String hoten, Date ngaysinh, String gioitinh, String soCMND, String sodienthoai, String email, String loiakhach, String diachi) {
        super(id, hoten, ngaysinh, gioitinh, soCMND, sodienthoai, email);
        this.loiakhach = loiakhach;
        this.diachi = diachi;
    }

    public String getLoiakhach() {
        return loiakhach;
    }

    public void setLoiakhach(String loiakhach) {
        this.loiakhach = loiakhach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}