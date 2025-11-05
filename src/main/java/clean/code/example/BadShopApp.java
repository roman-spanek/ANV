package clean.code.example;

public class BadShopApp {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();
        shop.addProduct("Laptop");
        shop.addProduct("Phone");
        shop.addToCart("Laptop");
        shop.addToCart("Tablet"); // Product not available
        shop.checkout(0.1);
    }
}

/*
Issues in the Code

Single Responsibility Principle (SRP) violated: OnlineShop handles products, cart, checkout, discount—all in one class.

Open/Closed Principle violated: To add new features (like different pricing, shipping), you must modify OnlineShop.

DRY violated: Cart management and product checks are repeated in multiple methods.

KISS violated: Everything in one class; hard to maintain.

Magic numbers: 100 as price hardcoded.
 */