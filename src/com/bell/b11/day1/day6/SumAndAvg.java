package com.bell.b11.day1.day6;

import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {

        int a, b, sum;
        float avg;

        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        a=dc.nextInt();

        System.out.println("Enter the 2nd number");
        b=dc.nextInt();

        sum=a+b;
        avg=(float)((a+b)/2);
        System.out.println("sum :" +sum+ "\naverage:"+avg);

    }
}
