package MagicNumbers;

public class ShippingCostCalculator {

    public double calculateCost(double weight) {
        if (weight <= 5) {
            return weight * 10;   // 10 = price per kg for light packages?
        } else if (weight <= 20) {
            return weight * 8;    // 8 = price per kg for medium packages?
        } else {
            return weight * 5;    // 5 = price per kg for heavy packages?
        }
    }
}
