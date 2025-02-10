package com.capgemini.smart_warehouse_management_system;

public class Electronics extends WareHouseItem{
    private String brand;

    // Constructor to get the details
    Electronics(String name, double price, String brand){
        super(name,price);
        this.brand = brand;
    }

    // Display the item details
    @Override
    void displayWarehouseItemsDetails(){
        System.out.println("Name of the product :- " + getName() +
                "\nPrice of the product :- " + getPrice() +
                "\nBrand of the product :- " + brand);

        System.out.println("----------------------------");
    }

}
