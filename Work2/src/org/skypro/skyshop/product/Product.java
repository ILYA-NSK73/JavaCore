package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    protected final String name;

    public abstract String toString();

    public abstract boolean isSpecial();

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

}