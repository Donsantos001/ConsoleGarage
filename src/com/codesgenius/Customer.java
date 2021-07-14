package com.codesgenius;

public class Customer {
    private String number;
    private String name;
    private String firstName;
    private String address;

    public Customer() {
    }

    public Customer(String number, String name, String firstName, String address) {
        this.number = number;
        this.name = name;
        this.firstName = firstName;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
