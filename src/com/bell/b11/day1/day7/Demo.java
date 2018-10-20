package com.bell.b11.day1.day7;

public class Demo {

    public static void main(String[] args){

        Hospital h1=new Hospital();
        h1.setName("Childrens National");
        h1.setZipcode(20166);

        Hospital h2=new Hospital();
        h2.setName("pediatrics");
        h2.setZipcode(20152);

        Hospital h3= new Hospital("orthopedic",220102);


        System.out.println(h1.getName());
        System.out.println(h1.getZipcode());
        System.out.println(h2.getName());
        System.out.println(h2.getZipcode());
        System.out.println(h3.getName());
        System.out.println(h3.getZipcode());
    }
}

