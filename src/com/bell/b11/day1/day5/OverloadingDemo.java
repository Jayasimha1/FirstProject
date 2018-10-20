package com.bell.b11.day1.day5;

public class OverloadingDemo {
    public static void main(String [] args){
        Addition a1=new Addition();
        a1.add(10,20,"simha");
    }
}

class Addition{
    void add(int a, int b){
        System.out.println(a+b);


    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);

    }
    void add(int a,int b,String name){
        System.out.println("hey"+ name+"result"+ (a+b));
    }
}