package com.bell.b11.day1.day1;

public class ArmstrongDemo {
    public static void main(String[] args){
        int i=0;
        int a;
        int n=153;

        while(n>0)
        {
            a=n%10;
            n=n/10;
            i=i+(a*a*a);

        }

    }
}
