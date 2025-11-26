package cleancode.CopyAndPasteProgramming.refactored;

public class OrderUtils {

    public static double calculateTotalPrice(Order order) {
        double totalPrice = order.getItemPrice() * order.getQuantity();
        return totalPrice + totalPrice * 0.1;
    }

    public static void printOrderDetails(String label, Order order) {
        double totalPrice = calculateTotalPrice(order);
        System.out.println(label + " ID: " + order.getId());
        System.out.println("Total Price: " + totalPrice);
    }
}
