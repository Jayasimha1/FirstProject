package com.bell.b11.day1.day1;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");

        Integer num=sc.nextInt();
        int originalNumber;
        int reminder;
        int result=0;

        originalNumber=num;

        while (originalNumber !=0){
            reminder=originalNumber %10;
            result += Math.pow(reminder, 3);
            originalNumber /= 10;
        }
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");






    }
}
