package com.capgemini.dynamic_online_marketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog <T extends ProductCategory>{
    List<Product<T>> productsList = new ArrayList<>();

    public void addProduct(Product<T> product){
        productsList.add(product);
    }

    public void removeProduct(Product<T> product){
        productsList.remove(product);
    }

    public void getProduct(){
        for (Product<T> product: productsList) {
            product.displayProducts();
        }
    }

}
