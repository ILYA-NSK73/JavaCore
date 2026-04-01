package org.skypro.skyshop.product;

public class BestResultNotFound extends Exception {
    public BestResultNotFound(String search) {
        super("Лучший результат для запроса " + search + " не найден");
    }
}
