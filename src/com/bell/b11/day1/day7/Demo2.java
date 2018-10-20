package com.bell.b11.day1.day7;

public class Demo2 {
    public static void main(String[] args){

        Address a1= new Address();
        a1.setStreet("Shaw Road");
        a1.setCity("Ashburn");
        a1.setZipcode(22019);

        Address a2= new Address();
        a2.setCity("Fairfax");
        a2.setStreet("Lee Hwy");
        a2.setZipcode(22031);

        Address a3= new Address("asd","kdjkj",123);

        System.out.println(a1.getCity());
        System.out.println(a1.getStreet());
        System.out.println(a1.getZipcode());

        System.out.println(a2.getStreet());
        System.out.println(a2.getCity());
        System.out.println(a2.getZipcode());

        System.out.println(a3.getZipcode());
    }
}
