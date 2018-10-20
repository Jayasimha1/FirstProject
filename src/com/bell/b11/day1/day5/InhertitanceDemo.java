package com.bell.b11.day1.day5;

public class InhertitanceDemo {

    public static void main(String[] args){

    }
}

class Bike{
    int speed;
    Bike(){
        System.out.println("dummy bike constructor");
    }
    Bike(int speed){
        System.out.println("bike arg constructor");
        this.speed=speed;

    }
    void increaseSpeed(){
        speed=speed+1;
        System.out.println(speed);
    }
    void decreaseSpeed(){
        speed=speed-1;
        System.out.println(speed);
    }
}

class MountBike{
    int brake;
    MountBike()

    {
        System.out.println("dummy MountBike constructor");
    }
    MountBike(int brake){
        System.out.println("MountBike arg constructor");
        this.brake=brake;
    }
    void applyBreaks(){
        brake = brake-1;
        System.out.println(brake);

    }


    }
