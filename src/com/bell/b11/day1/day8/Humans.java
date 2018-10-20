package com.bell.b11.day1.day8;

public class Humans {

    void eat(){
        System.out.println("Human is eating");
        }

    }

    class boy extends Humans{
        @Override
        void eat() {
            System.out.println("boy is eating");
        }
        public static void main(String[] args){
            boy b1=new boy();
            b1.eat();
        }
    }
