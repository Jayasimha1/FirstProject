package com.bell.b11.day1.day10;


public class ObjectDemo{

    int a=10;
    String name ="jai";

    public static void main(String[] args){
        ObjectDemo od= new ObjectDemo();
        System.out.println( od.toString());

    }

    @Override
    public String toString() {
        return "ObjectDemo{" + "a=" + a + ", name='" + name + '\'' + '}';
    }
}




