package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.ProductBasket;
import java.lang.reflect.Array;
import java.util.Arrays;

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

        Product apple = new SimpleProduct("Яблоко ", 80);
        Product milk = new SimpleProduct("Молоко ", 91);
        Product cherry = new SimpleProduct("Вишня ", 60);
        Product cheese = new SimpleProduct("Сыр ", 255);
        Product tea = new SimpleProduct("Чай ", 170);

        ProductBasket ProductBasket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(milk);
        basket.addProduct(cherry);
        basket.addProduct(cheese);
        basket.addProduct(tea);

        System.out.println("Содержимое корзины");
        basket.printBasket();

        Article article1 = new Article("Яблоки - ", "Привезены прямо с Юга России");
        Article article2 = new Article("Наше молоко - ", " всегда свежее и вкусное! ");
        Article article3 = new Article("Наши Вишни - ", " Привезены прямо с Эквадора");

        SearchEngine engine = new SearchEngine(20);
        engine.add(apple);
        engine.add(milk);
        engine.add(cherry);
        engine.add(cheese);
        engine.add(tea);

        engine.add(article1);
        engine.add(article2);
        engine.add(article3);

        System.out.println("Поиск по строке фрукты : " );
        Searchable[] result1 = engine.search("Фрукты");
        System.out.println(Arrays.toString(result1));

        System.out.println("Поиск по строке овоищи : " );
        Searchable[] result2 = engine.search("Овощи");
        System.out.println(Arrays.toString(result2));

        System.out.println("Поиск по строке чаи : " );
        Searchable[] result3 = engine.search("Чаи");
        System.out.println(Arrays.toString(result3));

        System.out.println("Поиск по строке молочная продукция : " );
        Searchable[] result4 = engine.search("Молочная продукция");
        System.out.println(Arrays.toString(result4));

    }

    private static void printResults(SearchEngine engine, String query) {
        Searchable[] results = engine.search(query);
        System.out.println(Arrays.toString(results));

            }
        }