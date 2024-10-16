package com.Product;

class ProductFactory {
    public Product createProduct(int type) {
        switch (type) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            case 3:
                return new ConcreteProduct3();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
