package org.skypro.skyshop.product;

public abstract class Product {
    public abstract String toString();

    public abstract boolean isSpecial();

    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();
}