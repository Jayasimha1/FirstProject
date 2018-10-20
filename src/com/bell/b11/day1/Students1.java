package com.bell.b11.day1;

import com.bell.b11.day1.day2.Student;

import java.util.Scanner;

public class Students1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Students");
        int number=sc.nextInt();
        int id,count=1;
        String name;
        double fee;
        char section;
        Student1[] msc=new Student1[number];
        for (int i=0; i<number; i++){
            System.out.println(" Enter Student " + count+ " ID" );
            id= sc.nextInt();
            sc.nextLine();
            System.out.println(" Enter Student " + count+ " Name ");
            name=sc.nextLine();
            System.out.println(" Enter Student "+ count + " Fee ");
            fee=sc.nextDouble();
            sc.nextLine();
            System.out.println(" Enter Student "+count+ " Scetion+ ");
            section = sc.next().charAt(0);
            count++;
            Student1  stud1=new Student1(id, name, fee, section);
            msc[i]=stud1;
        }
        System.out.println("    Result      \n Id Name Fee Section" );
        for (int i=0; i<number; i++){
            System.out.println(msc[i]);
        }
        sc.close();
    }
}
class Student1{
    private int id;
    private String name;
    private double fee;
    private char section;

    Student1(){

    }

    Student1(int id, String name, double fee, char section){
        this.id= id;
        this.name=name;
        this.fee=fee;
        this.section=section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + fee + " " + section;

    }
}


