package com.bell.b11.day1.assignment2;

public class InterfaceSame {
    public static void main(String[] args){

    }
}

interface Jai1{
    public String job();
}
interface Jai2{
    public String job();
}

abstract class difference implements Jai1,Jai2 {
    public String job(){
        return "0";
        }
    }



