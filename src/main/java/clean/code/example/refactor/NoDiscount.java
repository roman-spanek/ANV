package clean.code.example.refactor;

public class NoDiscount extends Discount {
    @Override
    public double apply(double total) {
        if (next != null) return next.apply(total);
        return total;
    }
}