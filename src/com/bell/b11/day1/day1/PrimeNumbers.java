package com.bell.b11.day1.day1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){

        boolean prime=true;

        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        Integer num=sc.nextInt();

        for (int i=2; i<num; i++) {

            if (num % i == 0) {
                prime = false;


            }
        }
        if(prime==true)
            System.out.println("Given number is a prime");
            else
                System.out.println("Given number is not prime");


            }
        }





