package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 62);
        Product product2 = new Product("Молоко", 91);
        Product product3 = new Product("Сыр", 255);
        Product product4 = new Product("Яблоко", 80);
        Product product5 = new Product("Кофе", 350);
        Product product6 = new Product("Чай", 170);

        ProductBasket basket = new ProductBasket();

        // 1. Добавление продуктов в корзину
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        // 2. Добавление продукта в заполненную корзину
        basket.addProduct(product6);

        // 3. Печать содержимого корзины с несколькими товарами
        basket.printBasket();

        // 4. Получение стоимости корзины с несколькими товарами
        System.out.println("Общая стоимость: " + basket.getTotalPrice());

        // 5. Поиск товара, который есть в корзине
        System.out.println("Есть ли хлеб? " + basket.containsProduct("Хлеб"));

        // 6. Поиск товара, которого нет в корзине
        System.out.println("Есть ли чай? " + basket.containsProduct("Чай"));

        // 7. Очистка корзины
        basket.clear();

        // 8. Печать содержимого пустой корзины
        basket.printBasket();

        // 9. Получение стоимости пустой корзины
        System.out.println("Общая стоимость: " + basket.getTotalPrice());

        // 10. Поиск товара по имени в пустой корзине
        System.out.println("Есть ли хлеб? " + basket.containsProduct("Хлеб"));
    }
}