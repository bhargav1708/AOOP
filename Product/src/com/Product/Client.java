package com.Product;

public class Client {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        // Create different products
        Product product1 = factory.createProduct(1);
        Product product2 = factory.createProduct(2);
        Product product3 = factory.createProduct(3);

        // Display product information
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
    }
}
