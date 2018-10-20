package com.bell.b11.day1.day1;

import java.util.Scanner;
public class FactSecondDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int num = sc.nextInt();

        int factorial = fact(num);
        System.out.println("Factorial of entered number is: " + factorial);

    }

    static int fact(int n) {
        int output;
        if (n == 1) {
            return 1;
        }
        output = fact(n-1) * n;
        return output;
    }
    }