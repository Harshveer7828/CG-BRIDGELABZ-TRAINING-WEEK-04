package com.capgemini.dynamic_online_marketplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DynamicOnlineMarketPlaceTest {
    BookCategory bookCategory = new BookCategory();
    Product<BookCategory> book1 = new Product<>("Three men in a boat", 100, bookCategory);
    ProductCatalog bookCatalog = new ProductCatalog();

    @Test
    void checkTest(){
        bookCatalog.addProduct(book1);
        assertEquals("Three men in a boat",book1.getName());
        assertEquals(100,book1.getPrice());
        assertEquals("Books",book1.getCategory().getCategory());
    }

}
