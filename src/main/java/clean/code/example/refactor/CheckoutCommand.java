package clean.code.example.refactor;

public class CheckoutCommand implements Command {
    private final Cart cart;
    private final Discount discount;

    public CheckoutCommand(Cart cart, Discount discount) {
        this.cart = cart;
        this.discount = discount;
    }

    @Override
    public void execute() {
        double total = 0;
        for (Product p : cart.getProducts()) total += p.getPrice();
        total = discount.apply(total);
        System.out.println("Checkout total: " + total);
    }
}
