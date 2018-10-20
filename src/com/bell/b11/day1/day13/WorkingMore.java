package com.bell.b11.day1.day13;

import java.util.Objects;

public class WorkingMore {

    public static void main(String[] args) {
        String companyName;
        int empAddress;
        int houseNumber;
        int empid;
        String street;
        int zipCode;
        String empNAme;



    }
}
class employeeDetails{

    String companyName;
    int empAddress;
    int houseNumber;
    int empid;
    String street;
    int zipCode;
    String empNAme;


    public employeeDetails(String companyName, int empAddress, int houseNumber, int empid, String street, int zipCode, String empNAme) {
        this.companyName = companyName;
        this.empAddress = empAddress;
        this.houseNumber = houseNumber;
        this.empid = empid;
        this.street = street;
        this.zipCode = zipCode;
        this.empNAme = empNAme;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(int empAddress) {
        this.empAddress = empAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmpNAme() {
        return empNAme;
    }

    public void setEmpNAme(String empNAme) {
        this.empNAme = empNAme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employeeDetails that = (employeeDetails) o;
        return empAddress == that.empAddress && houseNumber == that.houseNumber && empid == that.empid && zipCode == that.zipCode && Objects.equals(companyName, that.companyName) && Objects.equals(street, that.street) && Objects.equals(empNAme, that.empNAme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, empAddress, houseNumber, empid, street, zipCode, empNAme);
    }
}