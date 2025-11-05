package clean.code.example.refactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();
    private final CartHistory history;

    public Cart(CartHistory history) { this.history = history; }

    public void addProduct(Product product) {
        history.save(this);
        products.add(product);
        System.out.println(product.getName() + " added to cart");
    }

    public void removeProduct(Product product) {
        if (products.contains(product)) {
            history.save(this);
            products.remove(product);
            System.out.println(product.getName() + " removed from cart");
        }
    }

    public List<Product> getProducts() { return Collections.unmodifiableList(products); }

    public CartMemento createMemento() { return new CartMemento(products); }

    public void restoreMemento(CartMemento m) {
        products.clear();
        products.addAll(m.getProducts());
    }
    public void printCart() {
        System.out.println("Cart contents:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + ": $" + p.getPrice());
        }
    }
}
