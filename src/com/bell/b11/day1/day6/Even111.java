package com.bell.b11.day1.day6;

import java.awt.*;
import java.util.Scanner;

public class Even111 {
    public static void main(String[] args){

        int num;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();

        if (num % 2 ==0){
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }


    }
}
