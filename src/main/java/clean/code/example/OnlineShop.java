package clean.code.example;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private final List<String> products = new ArrayList<>();
    private final List<String> cart = new ArrayList<>();

    void addProduct(String product) {
        products.add(product);
    }

    void removeProduct(String product) {
        products.remove(product);
    }

    void addToCart(String product) {
        if (products.contains(product)) {
            cart.add(product);
            System.out.println(product + " added to cart.");
        } else {
            System.out.println(product + " is not available.");
        }
    }
    void removeFromCart(String product) {
        cart.remove(product);
        System.out.println(product + " removed from cart.");
    }

    void checkout(double discountRate) {
        double total = 0;
        for (String product : cart) {
            total += 100; // All products cost 100
        }
        total = total - (total * discountRate);
        System.out.println("Total after discount: " + total);
        cart.clear();
    }

    void printProducts() {
        System.out.println("Products: " + products);
    }

    void printCart() {
        System.out.println("Cart: " + cart);
    }
}