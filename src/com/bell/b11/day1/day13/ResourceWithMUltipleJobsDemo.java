package com.bell.b11.day1.day13;

public class ResourceWithMUltipleJobsDemo {

    public static void main(String[] args) {
        Address1 addr1=new Address1(12,"chantily",20141);
        Employee emp1=new Employee(01,"siva",addr1);

        Address1 addr2= new Address1(13,"ashburn",20172);
        Employee emp2= new Employee(02,"simha",addr2);

        Address1 addr3= new Address1(14,"fairfax",38473);
        Employee emp3=new Employee(15,"malli",addr3);

        Employee[] empArray1={emp1,emp2};
        Employee[] empArray2={emp2,emp3};

        Company c1 =new Company("Wellsfrago",empArray1);
        Company c2=new Company("bofa",empArray2);
        findResourceWithMultipleJobs(c1,c2);



    }

    private static void findResourceWithMultipleJobs(Company c1, Company c2){

        Employee[] firstCompanyEmp = c1.getEmployees();
        Employee[] secondCompanyEmp= c2.getEmployees();

        for (Employee e1:firstCompanyEmp){
            for (Employee e2:secondCompanyEmp){
                if (e1.getName().equals(e2.getName()) && e1.getAddress().equals(e2.getAddress())){
                    System.out.println(e1.getName());
                }
            }
        }
    }
}
