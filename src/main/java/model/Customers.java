package model;

public class Customers {
    private String name;
    private String dob;
    private String address;
    private String linkimg;

    public Customers() {
    }

    public Customers(String name, String dob, String address, String linkimg) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.linkimg = linkimg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = String.valueOf(dob);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkimg() {
        return linkimg;
    }

    public void setLinkimg(String linkimg) {
        this.linkimg = linkimg;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", linkimg='" + linkimg + '\'' +
                '}';
    }
}

