package com.capgemini.smart_warehouse_management_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WareHouseManagementTest {
    Storage<Electronics> electronicsStorage;
    Storage<Furniture> furnitureStorage;
    Storage<Groceries> groceriesStorage;

    @BeforeEach
    void setUpList(){
        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }


    // add the items in the storage and check if it is available or not
    @Test
    void testAddAndRetrieveValue(){
        groceriesStorage.addItem(new Groceries("SHIMLA",200,"5 days"));
        electronicsStorage.addItem(new Electronics("FRIDGE",2000,"LG"));
        furnitureStorage.addItem(new Furniture("SOFA",20000,"Wooden"));

        // Test on groceries storage
        assertEquals("SHIMLA", groceriesStorage.getList().get(0).getName());
        assertEquals(200, groceriesStorage.getList().get(0).getPrice());

        // Test on furniture
        assertEquals("SOFA", furnitureStorage.getList().get(0).getName());
        assertEquals(20000, furnitureStorage.getList().get(0).getPrice());

        // Test on Electronic
        assertEquals("FRIDGE", electronicsStorage.getList().get(0).getName());
        assertEquals(2000, electronicsStorage.getList().get(0).getPrice());
    }

}
