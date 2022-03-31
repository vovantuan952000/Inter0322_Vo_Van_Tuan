package model;

public class customer {
    private String name;
    private String birthDay;
    private String phoneNumber;
    private String indentityNumer;
    private String address;
    private String typeCustomer;
    private String sex;
    private String email;

    public customer(String name, String birthDay, String phoneNumber, String indentityNumer, String address, String typeCustomer, String sex, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.indentityNumer = indentityNumer;
        this.address = address;
        this.typeCustomer = typeCustomer;
        this.sex = sex;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIndentityNumer() {
        return indentityNumer;
    }

    public void setIndentityNumer(String indentityNumer) {
        this.indentityNumer = indentityNumer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public customer() {
    }
}
