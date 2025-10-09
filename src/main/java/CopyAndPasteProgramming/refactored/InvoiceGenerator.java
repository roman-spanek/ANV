package CopyAndPasteProgramming.refactored;

public class InvoiceGenerator {
    public void generateInvoice(Order order) {
        OrderUtils.printOrderDetails("Invoice", order);
    }
}

