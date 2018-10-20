package com.bell.b11.day1.day3;

public class Test1 {
    public static void main(String[] args){


        Emp e1= new Emp(11, "jai");
        Emp e2= new Emp(12,"raj");
        Emp e3=new Emp(13,"ravi");

        Emp[] e =new Emp[5];
        e[0]=e1;
        e[2]=e2;
        e[4]=e3;

        for (Object o : e) {
            if (o instanceof Emp){
                Emp ee = (Emp)o;
                System.out.println(ee.eid + "---" + ee.ename);
            }
            if (o==null){

            }
            System.out.println(o);
        }



    }
}
