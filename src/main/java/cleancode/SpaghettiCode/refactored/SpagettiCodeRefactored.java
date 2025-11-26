package cleancode.SpaghettiCode.refactored;

public class SpagettiCodeRefactored {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product apple = new Product("apple", 0.5);
        Product banana = new Product("banana", 0.2);
        Product orange = new Product("orange", 0.8);

        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);

        System.out.println("Total price: " + cart.calculateTotal());
    }
}
