package com.capgemini.smart_warehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WareHouseItem>{
    private List<T> itemsList = new ArrayList<>();

    // Method to add the item in the list
    public void addItem(T item){
        itemsList.add(item);
    }

    // Method to remove item from the list
    public void removeItem(T item){
        itemsList.remove(item);
    }

    // Get item list
    public List<T> getList(){
        return itemsList;
    }

}
