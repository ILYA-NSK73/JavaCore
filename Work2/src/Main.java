import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class Main {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product product1 = new Product("Яблоко", 20);
        Product product2 = new Product("Вишня", 60);
        Product product3 = new Product("Бананы", 31);
        Product product4 = new Product("Груша", 45);
        Product product5 = new Product("Гранат", 98);

        ProductBasket basket1 = new ProductBasket();

        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product3);
        basket1.addProduct(product4);
        basket1.addProduct(product5);

    }
}