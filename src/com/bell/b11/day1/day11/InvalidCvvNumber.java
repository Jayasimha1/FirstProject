package com.bell.b11.day1.day11;

public class InvalidCvvNumber extends java.lang.Exception {

    String number;

    InvalidCvvNumber() {

    }

    InvalidCvvNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {


        return "CVV number is not valid";
    }
}
