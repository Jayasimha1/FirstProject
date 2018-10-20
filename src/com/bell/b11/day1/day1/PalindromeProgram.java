package com.bell.b11.day1.day1;

import java.util.Scanner;

public class PalindromeProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer num=sc.nextInt();
        int n = num;
        int reversedInteger = 0;
        int remainder;
        int originalInteger;

        originalInteger = num;


        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}