package com.bell.b11.day1.day1;

public class FibonaccicDemo {
    public static void main(String[] args) {

        int n = 100, r1 = 0, r2 = 1;

        System.out.print("Print upto" + n + ": ");
        while (r1 <= n)
        {
            System.out.print(r1 + " + ");

            int sum = r1 + r2;
            r1 = r2;
            r2 = sum;
        }
    }
}
