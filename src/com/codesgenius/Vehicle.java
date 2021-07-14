package com.codesgenius;

public class Vehicle {
    private String registrationNumber;
    private String type;
    private String make;
    private String model;
    private String fiscalHorsePower;

    public Vehicle() {
    }

    public Vehicle(String registrationNumber, String type, String make, String model, String fiscalHorsePower) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.make = make;
        this.model = model;
        this.fiscalHorsePower = fiscalHorsePower;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFiscalHorsePower() {
        return fiscalHorsePower;
    }

    public void setFiscalHorsePower(String fiscalHorsePower) {
        this.fiscalHorsePower = fiscalHorsePower;
    }
}
