package com.capgemini.dynamic_online_marketplace;

public class Main {
    public static void main(String[] args) {

        // Creating the categories
        BookCategory book = new BookCategory();
        ClothingCategory cloth = new ClothingCategory();
        GadgetCategory gadget = new GadgetCategory();

        // Create a product of category book
        Product<BookCategory> book1 = new Product<>("Harsh veer book",200,book);
        Product<BookCategory> book2 = new Product<>("Akash ki book",0,book);
        Product<BookCategory> book3 = new Product<>("Om ki book",2,book);

        // Create the product of category  clothes
        Product<ClothingCategory> cloth1 = new Product<>("ZARA",2000,cloth);
        Product<ClothingCategory> cloth2 = new Product<>("LEVIS",1500,cloth);
        Product<ClothingCategory> cloth3 = new Product<>("HNM",500,cloth);

        // Create a product of category gadget
        Product<GadgetCategory> gadget1 = new Product<>("CAR",2000,gadget);
        Product<GadgetCategory> gadget2 = new Product<>("HELICOPTER",1500,gadget);
        Product<GadgetCategory> gadget3 = new Product<>("BUS",500,gadget);

        // Defining the catalog of book,gadget and clothes
        ProductCatalog bookCatalog = new ProductCatalog();
        ProductCatalog clothCatalog = new ProductCatalog();
        ProductCatalog gadgetCategory = new ProductCatalog();

        // Add the product into the book catalog
        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);
        bookCatalog.addProduct(book3);

        // Add the product into the cloth category
        clothCatalog.addProduct(cloth1);
        clothCatalog.addProduct(cloth2);
        clothCatalog.addProduct(cloth3);

        // Add the product into the category of gadget
        gadgetCategory.addProduct(gadget1);
        gadgetCategory.addProduct(gadget2);
        gadgetCategory.addProduct(gadget3);

        // Utility to calculate the discount amount
        DiscountUtility discount = new DiscountUtility();
        discount.calculatDiscount(gadget1,10);

    }
}
