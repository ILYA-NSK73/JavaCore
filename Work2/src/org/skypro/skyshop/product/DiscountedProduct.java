package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private final int basePrice;
    public final int discountPercent; // в процентах от 0 до 100

    public DiscountedProduct(String name, int basePrice, int discountPercent) {
        super(name);
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Базовая цена продукта со скидкой должна быть строго больше 0. Передано: " + discountPercent);
        }
        if (discountPercent < 0) {
            throw new IllegalArgumentException("Скидка должна быть в диапазоне от 0 до 10 включительно. Передано: " + discountPercent);
        }
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    @Override
    public int getPrice() {
        return basePrice - (basePrice * discountPercent / 100);
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discountPercent + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
