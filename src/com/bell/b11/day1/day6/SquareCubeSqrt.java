package com.bell.b11.day1.day6;

import java.util.Scanner;

public class SquareCubeSqrt {
    public static void main(String[] args){

        int num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();

        System.out.println("Square of " +num+ ":" +Math.pow(num,2));
        System.out.println("cube of" +num+ ":" +Math.pow(num,3));
        System.out.println("Square root of " +num+ ":" +Math.sqrt(num));

    }
}
