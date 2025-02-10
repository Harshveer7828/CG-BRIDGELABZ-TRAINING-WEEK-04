package com.capgemini.dynamic_online_marketplace;

public abstract class ProductCategory {
    private String category;

    ProductCategory(String category){
        this.category = category;
    }

    // Get category
    public String getCategory(){
        return category;
    }
}
