package com.capgemini.smart_warehouse_management_system;

public class Groceries extends WareHouseItem{
    private String expiryDate;

    Groceries(String name, double price, String expiryDate){
        super(name,price);
        this.expiryDate = expiryDate;
    }

    // Display details of the item
    @Override
    void displayWarehouseItemsDetails(){
        System.out.println("Name of the product :- " + getName() +
                "\nPrice of the product :- " + getPrice() +
                "\nExpiry of the product :- " + expiryDate);

        System.out.println("----------------------------");
    }

}
