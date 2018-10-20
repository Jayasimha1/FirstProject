package com.bell.b11.day1.day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InavalidCreditCardNumber extends java.lang.Exception{

    String number;

    InavalidCreditCardNumber(){

    }

    InavalidCreditCardNumber(String number){
        this.number=number;
    }

    @Override
    public String toString() {

        if (number !=null){

            LocalDateTime ldt= LocalDateTime.now();

            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");

            System.out.println(ldt.format(dtf));
            return "Hey, looks like the credit card number,"+number+ "is of size "+ "please provide 16 digits number";
        }
        return "Hey,Sorry....the number you provided is invalid.please try again";
    }
}

