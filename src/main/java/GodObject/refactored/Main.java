package GodObject.refactored;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        OrderManager orderManager = new OrderManager();
        ReportGenerator reportGenerator = new ReportGenerator();

        userManager.addUser("Alice");
        userManager.addUser("Bob");

        orderManager.addOrder("Order1");
        orderManager.addOrder("Order2");

        reportGenerator.generateReport(userManager.getUsers(), orderManager.getOrders());
    }
}
