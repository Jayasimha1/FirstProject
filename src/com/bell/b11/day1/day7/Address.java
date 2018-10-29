package com.bell.b11.day1.day7;

public class Address{

    private String street;
    private String city;
    private int zipcode;

    Address(){
        System.out.println();
    }

    Address(String street, String city,int zipcode){
        this.zipcode=zipcode;
        this.city=city;
        this.street=street;
    }

    public String getStreet(){
        return street;

    }
    public void setStreet(String street){
        this.street = street;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;

    }

    public int getZipcode(){
        return zipcode;
    }

    public void setZipcode(int zipcode){
        this.zipcode=zipcode;
    }

    @Override
    public String toString() {
        return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", zipcode=" + zipcode + '}';
    }
}