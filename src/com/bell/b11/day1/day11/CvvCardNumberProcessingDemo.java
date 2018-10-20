package com.bell.b11.day1.day11;

import java.util.Scanner;

public class CvvCardNumberProcessingDemo {

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the CVV number:");
        String cvvNumber=scan.next();

        CvvCardNumberProcessingDemo ccnpd=new CvvCardNumberProcessingDemo();
        try{
            ccnpd.numberProcessing(cvvNumber);
        }catch (InvalidCvvNumber invalidCvvNumber){
            System.out.println(invalidCvvNumber);

        }

    }


    private void numberProcessing(String cvvNumber) throws InvalidCvvNumber {

        if (cvvNumber.length()==3){
            System.out.println("valid CVV number");
        }else {
            throw new InvalidCvvNumber();
        }
    }
}