package com.kkmserver;

public class CheckString {

    private int id;

    String name;
    double quantity;
    double price;
    double amount;
    int department;
    int tax;
    int signMethodCalculation;
    int signCalculationObject;
    CheckEntity checkEntity;
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
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getTax() {
        return tax;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }
    public int getSignMethodCalculation() {
        return signMethodCalculation;
    }
    public void setSignMethodCalculation(int signMethodCalculation) {
        this.signMethodCalculation = signMethodCalculation;
    }
    public int getSignCalculationObject() {
        return signCalculationObject;
    }
    public void setSignCalculationObject(int signCalculationObject) {
        this.signCalculationObject = signCalculationObject;
    }
    public CheckEntity getCheckEntity() {
        return checkEntity;
    }
    public void setCheckEntity(CheckEntity checkEntity) {
        this.checkEntity = checkEntity;
    }
}
