package com.bell.b11.day1.day1;

import java.util.Scanner;

public class PerfectNumberDemo {
    public static void main(String[] args) {
        int i;
        int Sum = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer num = sc.nextInt();

        for (i = 1; i < num; i++) ;
        {
            if (num % i == 0) {
                Sum = Sum + i;

            }
        }
        if(Sum == num){
            System.out.println("Given number is perfect number");

        }
        else{
            System.out.println("Given number is not perfect number");
        }
    }
}




