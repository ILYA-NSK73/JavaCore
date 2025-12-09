package org.skypro.skyshop;

import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        SimpleProduct product1 = new SimpleProduct("Хлеб", 62);
        SimpleProduct product2 = new SimpleProduct("Молоко", 91);
        DiscountedProduct product3 = new DiscountedProduct("Сыр", 255, 20);
        SimpleProduct product4 = new SimpleProduct("Яблоко", 80);
        SimpleProduct product5 = new SimpleProduct("Кофе", 350);
        DiscountedProduct product6 = new DiscountedProduct("Чай", 170, 10);


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
        System.out.println("Есть ли сыр? " + basket.containsProduct("Сыр"));
        System.out.println("Есть ли чай? " + basket.containsProduct("Чай"));

        // 5. Поиск товара, который есть в корзине
        System.out.println("Есть ли хлеб? " + basket.containsProduct("Хлеб"));

        // 6. Поиск товара, которого нет в корзине
        System.out.println("Есть ли чай? " + basket.containsProduct("Чай"));

        // 7. Очистка корзины
        basket.clear();
        basket.printBasket();
        System.out.println("Общая стоимость: " + basket.getTotalPrice());
        System.out.println("Есть ли хлеб? " + basket.containsProduct("Хлеб"));

        // 8. Печать содержимого пустой корзины
        basket.printBasket();

        // 9. Получение стоимости пустой корзины
        System.out.println("Общая стоимость: " + basket.getTotalPrice());

        // 10. Поиск товара по имени в пустой корзине
        System.out.println("Есть ли хлеб? " + basket.containsProduct("Хлеб"));
    }
}