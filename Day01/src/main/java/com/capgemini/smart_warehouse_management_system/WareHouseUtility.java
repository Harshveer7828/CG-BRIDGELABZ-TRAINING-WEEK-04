package com.capgemini.smart_warehouse_management_system;

import java.util.List;

public class WareHouseUtility {
    // Private constructor to hide the details
    private WareHouseUtility(){}
    public static void displayStorageItem(List<? extends WareHouseItem> itemList){
        for (WareHouseItem item : itemList) {
            item.displayWarehouseItemsDetails();
        }
    }
}
