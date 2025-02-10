package com.capgemini.smart_warehouse_management_system;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Voltas2211",25000,"Voltas"));
        electronicsStorage.addItem(new Electronics("Samsung all door", 100000,"Samsung"));
        electronicsStorage.addItem(new Electronics("Realme Narzo 60 5g", 16400,"Realme"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 2.5, "2025-01-10"));
        groceriesStorage.addItem(new Groceries("Bread", 1.2, "2024-12-01"));


        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa", 500, "Leather"));
        furnitureStorage.addItem(new Furniture("Table", 150, "Wood"));

        WareHouseUtility.displayStorageItem(electronicsStorage.getList());
        WareHouseUtility.displayStorageItem(furnitureStorage.getList());
        WareHouseUtility.displayStorageItem(groceriesStorage.getList());

    }
}
