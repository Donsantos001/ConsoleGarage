package com.codesgenius;

public class Booking {
    private Customer customer;
    private Vehicle vehicle;
    private Garage loanGarage;
    private Garage returnGarage;

    public Booking() {
    }

    public Booking(Customer customer, Vehicle vehicle, Garage loanGarage, Garage returnGarage) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.loanGarage = loanGarage;
        this.returnGarage = returnGarage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Garage getLoanGarage() {
        return loanGarage;
    }

    public void setLoanGarage(Garage loanGarage) {
        this.loanGarage = loanGarage;
    }

    public Garage getReturnGarage() {
        return returnGarage;
    }

    public void setReturnGarage(Garage returnGarage) {
        this.returnGarage = returnGarage;
    }
}
