package com.bell.b11.day1.day8;

public class Dog extends Animal{

    public void sound(){
        System.out.println("woof");
    }
    public static void main(String[] args){
        Animal obj=new Dog();
        obj.sound();
    }
}
