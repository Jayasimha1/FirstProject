package com.bell.b11.day1.day10;

import java.util.Objects;

public class ObjectDemo3 {

    public static void main(String[] args){

    }

    class Employee{

    }

    class Address{

        private String street;
        int houseNo;
        int zip;

        public Address(String street, int houseNo, int zip) {
            this.street = street;
            this.houseNo = houseNo;
            this.zip = zip;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(int houseNo) {
            this.houseNo = houseNo;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return houseNo == address.houseNo && zip == address.zip && Objects.equals(street, address.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(street, houseNo, zip);
        }
    }
}

