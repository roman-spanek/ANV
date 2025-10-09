package CopyAndPasteProgramming;

public class InvoiceGenerator {
    public void generateInvoice(Order order) {
        double totalPrice = order.getItemPrice() * order.getQuantity();
        totalPrice += totalPrice * 0.1; // Přidání daně
        System.out.println("Invoice ID: " + order.getId());
        System.out.println("Total Price: " + totalPrice);
    }
}

