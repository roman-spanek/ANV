package clean.code.example.refactor;

public class PercentageDiscount extends Discount {
    private final double rate;
    public PercentageDiscount(double rate) { this.rate = rate; }

    @Override
    public double apply(double total) {
        double discounted = total * (1 - rate);
        if (next != null) discounted = next.apply(discounted);
        return discounted;
    }
}
