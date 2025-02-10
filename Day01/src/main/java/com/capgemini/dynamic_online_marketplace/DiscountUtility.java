package com.capgemini.dynamic_online_marketplace;

public class DiscountUtility {
    // Method to count the discount
    public <T extends Product> void calculatDiscount(T product, double discountPercentage) {
        double discountAmount = product.getPrice() * (discountPercentage / 100);
        System.out.println("Price after discount is: " + (product.getPrice() - discountAmount));
    }
}
