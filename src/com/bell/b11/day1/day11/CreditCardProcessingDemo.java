package com.bell.b11.day1.day11;

import java.util.Random;
import java.util.Scanner;

public class CreditCardProcessingDemo {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the credit card number:");
        String cardNumber =scan.next();

        CreditCardProcessingDemo ccpd=new CreditCardProcessingDemo();
        try {
            ccpd.processItem(cardNumber);
        } catch (InavalidCreditCardNumber inavalidCreditCardNumber) {
            System.out.println(inavalidCreditCardNumber);
        }


   }

    private void processItem(String cardNumber) throws InavalidCreditCardNumber {

        if (cardNumber.length()== 16){
            System.out.println("Thank you! your order has been processed,refnumber" +new Random().nextInt());
        }else{
            throw new InavalidCreditCardNumber();
        }

    }
}
