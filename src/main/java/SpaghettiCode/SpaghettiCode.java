package SpaghettiCode;

public class SpaghettiCode {
    public static void main(String[] args) {
        double total = 0;
        String[] items = {"apple", "banana", "orange"};
        int[] quantities = {3, 2, 5};

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("apple")) {
                total += 0.5 * quantities[i];
            } else if (items[i].equals("banana")) {
                total += 0.2 * quantities[i];
            } else if (items[i].equals("orange")) {
                total += 0.8 * quantities[i];
            }
        }

        System.out.println("Total price: " + total);
    }
}
