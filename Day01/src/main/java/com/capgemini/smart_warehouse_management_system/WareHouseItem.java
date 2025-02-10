package com.capgemini.smart_warehouse_management_system;

abstract class WareHouseItem {
    private String name;
    private double price;

    WareHouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getter for private values
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    // Abstract method which display the Details
    void displayWarehouseItemsDetails(){}
}
