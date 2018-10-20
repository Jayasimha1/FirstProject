package com.bell.b11.day1.day5;

public class AccessModifiersDemo {

    Car c1 = new Car("telsa", 3000);
}

class Car{

    String model;
    int cost;

    Car(){
        System.out.println("I am inside default comnst");

    }
    Car(String model, int cost){
        System.out.println("i am inside cons");
       // model m;
        //cost=c;
    }
}