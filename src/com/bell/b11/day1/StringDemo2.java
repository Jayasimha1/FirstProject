package com.bell.b11.day1;

public class StringDemo2 {
    public static void main(String[] args) {

        String s="This is a java class";
        String reverse = new String();


        int count=1;

        for (int i=1; i<s.length()-1; i++){

            if ((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')){

                count++;

            }

        }
        System.out.println("Number of words in String= "+count);
        System.out.println("Length of s:"+s.length());
        System.out.println("Single character in a string:"+s.indexOf('s'));
        System.out.println("String after reverse:" +reverse);
        System.out.println("Replace:"+s.replace("java","SQL"));
        System.out.println("Index of j:" +s.indexOf('j'));
        System.out.println("convert Uppercase:" +s.toUpperCase());
        System.out.println("middle charcter:" +s.length()/2);

       for (int i=1;i<=s.length(); i++){
            System.out.println("Reverse of word in string: " + s.charAt(s.length()));
        }

    }

   }
