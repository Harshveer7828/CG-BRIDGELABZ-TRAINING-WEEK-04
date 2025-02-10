package com.capgemini.smart_warehouse_management_system;

public class Furniture extends WareHouseItem{
    private String materialType;

    // Constructor method to initialize the values
    Furniture(String name, double price, String materialType){
        super(name, price);
        this.materialType = materialType;
    }

    // Display the furniture item
    @Override
    void displayWarehouseItemsDetails(){
        System.out.println("Name of the product :- " + getName() +
                "\nPrice of the product :- " + getPrice() +
                "\nMaterial of the product :- " + materialType);

        System.out.println("----------------------------");
    }

}
