package com.bell.b11.day1.day13;

import java.util.Objects;

public class Address1 {

    int hNo;
    String street;
    int zipcode;

    public Address1(int hNo, String street, int zipcode) {
        this.hNo = hNo;
        this.street = street;
        this.zipcode = zipcode;
    }

    public int gethNo() {
        return hNo;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address1 address1 = (Address1) o;
        return hNo == address1.hNo && zipcode == address1.zipcode && Objects.equals(street, address1.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hNo, street, zipcode);
    }

    @Override
    public String toString() {
        return "Address1{" + "hNo=" + hNo + ", street='" + street + '\'' + ", zipcode=" + zipcode + '}';
    }
}
