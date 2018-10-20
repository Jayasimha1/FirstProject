package com.bell.b11.day1.day6;

import javax.xml.bind.SchemaOutputResolver;

public class InterfaceDemo {

    public static void main(String[] args){
        Vehicle v1 = new Tesla();
        Vehicle v2= new Accord();
        v1.fuel();
        v1.mode();
        v1.speed();
    }

}
// By default all methods are public abstract
//All variables are final and static
// Interfaces dosen't allow constructors
// any sub class of interface implements all the methods or make that subclass as abstract class

interface Vehicle{

    void speed();
    void mode();
    void fuel();

}
abstract class Plane implements Vehicle{

     @Override
     public void mode() {
         System.out.println(" On air");
     }

     @Override
     public void fuel() {
         System.out.println("White petrol");

     }
 }
class jet extends Plane{


    @Override
    public void speed() {
        System.out.println("328mph");

    }
}
class Boeing extends Plane{

    @Override
    public void speed() {
        System.out.println("600 mph");

    }
}
abstract class Car implements Vehicle{


    @Override
    public void mode() {
        System.out.println("on road");
    }
}
class Tesla extends Car{

    @Override
    public void speed() {
        System.out.println("60 miles per 1 minute");
    }

    @Override
    public void fuel() {
        System.out.println("battery");

    }
}
class Accord extends Car{

    @Override
    public void speed() {
        System.out.println("60 miles for 5 minutes");
    }

    @Override
    public void fuel() {
        System.out.println("petrol");

    }
}
class truck extends Car{

    @Override
    public void speed() {
        System.out.println("60 miles for 10 minutes");
    }

    @Override
    public void fuel() {
        System.out.println("disel");

    }
}
abstract class Ship implements Vehicle{
    public void mode(){
        System.out.println("on water");
    }
    public void fuel(){
        System.out.println("disel");
    }
}
class Crusie extends Ship{

    @Override
    public void speed() {
        System.out.println("60 miles for 5minutes");
    }
    }
class Cargo extends Ship{

    @Override
    public void speed() {
        System.out.println("60 miles for 10 minutes");
    }
}
