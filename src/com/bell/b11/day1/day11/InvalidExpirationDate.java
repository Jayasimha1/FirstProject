package com.bell.b11.day1.day11;

import java.time.format.DateTimeFormatter;

public class InvalidExpirationDate extends java.lang.Exception {

    String number;

    InvalidExpirationDate(){

    }


    InvalidExpirationDate(String number){
        this.number=number;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return "InvalidExpirationDate{" + "number='" + number + '\'' + '}';
    }
}
