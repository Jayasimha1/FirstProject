package com.bell.b11.day1.day1;

import java.util.Scanner;

public class MinimumNUmber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numberes");
        int num;
        int i;
        int temp;
        int small;
        temp=sc.nextInt();
        System.out.println("Enter "+temp+"number");
        small=sc.nextInt();

        for(i=1;i<temp;i++){
            temp=sc.nextInt();
            if(temp>small)
                continue;
            else
                small=temp;

        }
        System.out.println("Smallest number is"+small);



    }

}
