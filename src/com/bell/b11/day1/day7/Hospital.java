package com.bell.b11.day1.day7;

public class Hospital {

    private String name;
    private int zipcode;

    Hospital(){
        System.out.println("Default constructor");

    }
    Hospital(String name, int zipcode){
        this.name=name;
        this.zipcode=zipcode;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

     public void setZipcode(int zipcode) {
        this.zipcode =zipcode;

        }
        public int getZipcode(){
        return zipcode;
        }
    }

