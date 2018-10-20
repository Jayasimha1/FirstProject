package com.bell.b11.day1.day10;

import java.util.Objects;

public class ObjecrDemo2 {

    public static void main(String[] args){
        int a=10;
        int b=20;
        if(a==b){
            System.out.println("a&b are equal");}
            else{
            System.out.println("a& b are not equal");
        }

        Hello h1=new Hello(10,20);
            Hello h2= new Hello(10,20);
            Hello h3= null;
            ABC a1=new ABC();
            Student s1=new Student(123,"jai");
            Student s2=new Student(123,"jai");
            if (h1==h2){
                System.out.println(" both are same");}
                else{
                System.out.println("not equal");
            }

            if (h1.equals(h3)){
                System.out.println("both are same");}
                else{
                System.out.println("not equal");

            }

            if(s1.equals(s2)) {
                System.out.println("both are same");
                }
                else{
                System.out.println("not same ");
            }


    }
}

class Hello{
    int x,y;

    Hello(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Hello{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hello hello = (Hello) o;
        return x == hello.x && y == hello.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class ABC{

}

class Student{

    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
