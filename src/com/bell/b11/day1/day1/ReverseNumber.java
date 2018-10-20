package com.bell.b11.day1.day1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter revese number");

        int original= sc.nextInt();
        int reversenum=0;
        int reminder;


        while (original !=0) {
            reminder = original % 10;
            reversenum = reversenum * 10 + reminder;
            original = original / 10;
        }
        System.out.println("Reverse of the number is " +reversenum);

        }
    }

