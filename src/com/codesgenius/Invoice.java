package com.codesgenius;

import java.util.Date;

public class Invoice {
    //information part
    private Long invoiceNumber;
    private Date date;
    private Customer customer;
    private Garage loanGarage;
    private Garage returnGarage;
    private Vehicle vehicle;
    private Date rentalStart;
    private Date rentalEnd;
    private double mileageStart;
    private double mileageEnd;
    private double totalDistance;

    //amount part
    private double mileageSubTotal;
    private double packageSubTotal;
    private double vat;
    private double grandTotal;

    //payment part
    private String checkNumber;
    private String cardNumber;
    private Date expiryDate;

    public Invoice(Long invoiceNumber, Date date, Customer customer, Garage loanGarage, Garage returnGarage, Vehicle vehicle, Date rentalStart, Date rentalEnd, double mileageStart, double mileageEnd, double totalDistance, double mileageSubTotal, double packageSubTotal, double vat, double grandTotal, String checkNumber, String cardNumber, Date expiryDate) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.customer = customer;
        this.loanGarage = loanGarage;
        this.returnGarage = returnGarage;
        this.vehicle = vehicle;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
        this.mileageStart = mileageStart;
        this.mileageEnd = mileageEnd;
        this.totalDistance = totalDistance;
        this.mileageSubTotal = mileageSubTotal;
        this.packageSubTotal = packageSubTotal;
        this.vat = vat;
        this.grandTotal = grandTotal;
        this.checkNumber = checkNumber;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(Date rentalStart) {
        this.rentalStart = rentalStart;
    }

    public Date getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(Date rentalEnd) {
        this.rentalEnd = rentalEnd;
    }

    public double getMileageStart() {
        return mileageStart;
    }

    public void setMileageStart(double mileageStart) {
        this.mileageStart = mileageStart;
    }

    public double getMileageEnd() {
        return mileageEnd;
    }

    public void setMileageEnd(double mileageEnd) {
        this.mileageEnd = mileageEnd;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getMileageSubTotal() {
        return mileageSubTotal;
    }

    public void setMileageSubTotal(double mileageSubTotal) {
        this.mileageSubTotal = mileageSubTotal;
    }

    public double getPackageSubTotal() {
        return packageSubTotal;
    }

    public void setPackageSubTotal(double packageSubTotal) {
        this.packageSubTotal = packageSubTotal;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
