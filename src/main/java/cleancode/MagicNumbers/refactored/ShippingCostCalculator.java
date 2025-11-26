package cleancode.MagicNumbers.refactored;

public class ShippingCostCalculator {

    private static final double LIGHT_PACKAGE_RATE = 10.0;
    private static final double MEDIUM_PACKAGE_RATE = 8.0;
    private static final double HEAVY_PACKAGE_RATE = 5.0;

    private static final double LIGHT_PACKAGE_LIMIT = 5.0;
    private static final double MEDIUM_PACKAGE_LIMIT = 20.0;

    public double calculateCost(double weight) {
        if (weight <= LIGHT_PACKAGE_LIMIT) {
            return weight * LIGHT_PACKAGE_RATE;
        } else if (weight <= MEDIUM_PACKAGE_LIMIT) {
            return weight * MEDIUM_PACKAGE_RATE;
        } else {
            return weight * HEAVY_PACKAGE_RATE;
        }
    }
}
