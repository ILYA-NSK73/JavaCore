import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class Main {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product product1 = new SimpleProduct("Яблоко", 20);
        Product product2 = new SimpleProduct("Вишня", 60);
        Product product3 = new SimpleProduct("Бананы", 31);
        Product product4 = new SimpleProduct("Груша", 45);
        Product product5 = new SimpleProduct("Гранат", 98);

        ProductBasket basket1 = new ProductBasket();

        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product3);
        basket1.addProduct(product4);
        basket1.addProduct(product5);

    }
}