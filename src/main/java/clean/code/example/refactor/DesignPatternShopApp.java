package clean.code.example.refactor;

public class DesignPatternShopApp {
    public static void main(String[] args) {
        // Factory
        Product laptop = ProductFactory.createProduct("laptop");
        Product phone = ProductFactory.createProduct("phone");

        // Builder
        Product custom = new ProductBuilder().setName("Custom PC").setPrice(2000).build();

        // Prototype
        Product clonedLaptop = laptop.clone();

        // Cart & History
        CartHistory history = new CartHistory();
        Cart cart = new Cart(history);
        cart.addProduct(laptop);
        cart.addProduct(phone);
        cart.addProduct(custom);

        cart.printCart();

        // Undo example
        history.undo(cart);

        cart.printCart();

        // Chain of Responsibility: discount
        Discount discount = new PercentageDiscount(0.1);
        discount.setNext(new NoDiscount());

        // Command pattern: checkout
        Command checkout = new CheckoutCommand(cart, discount);
        checkout.execute();
    }
}