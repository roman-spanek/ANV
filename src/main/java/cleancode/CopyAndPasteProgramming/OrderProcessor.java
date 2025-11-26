package cleancode.CopyAndPasteProgramming;

public class OrderProcessor {
    public void processOrder(Order order) {
        double totalPrice = order.getItemPrice() * order.getQuantity();
        totalPrice += totalPrice * 0.1; // Přidání daně
        System.out.println("Order ID: " + order.getId());
        System.out.println("Total Price: " + totalPrice);
    }
}


