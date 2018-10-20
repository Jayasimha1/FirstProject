package com.bell.b11.day1.day2;

public class DetailsOfCustomer {
    public static void main(String[] args) {
        Phone s1 = new Phone();

        s1.imeiId = 1234567;
        s1.brand = "iphone";
        s1.name = "sixPlus";
        s1.simCardType = "tMobile";


        System.out.println(s1.imeiId);

        Phone s2= new Phone();

        s2.imeiId=987766;
        s2.brand="Samsung";
        s2.name="NoteEight";
        s2.simCardType="at&t";


        System.out.println(s2.simCardType);

    }



}
