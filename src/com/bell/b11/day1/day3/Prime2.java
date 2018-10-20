package com.bell.b11.day1.day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        Integer num=sc.nextInt();

        for(int i=1; i<=num; i++);
            if(num % 2 !=0){
                System.out.println("Given number is prime");
                if(false){

                }
                else
                    System.out.println("Given number is not prime");
            }

    }
}
