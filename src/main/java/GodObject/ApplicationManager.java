package GodObject;

import java.util.ArrayList;
import java.util.List;

public class ApplicationManager {

    private List<String> users = new ArrayList<>();
    private List<String> orders = new ArrayList<>();

    // User management
    public void addUser(String user) {
        users.add(user);
    }

    public void removeUser(String user) {
        users.remove(user);
    }

    // Order management
    public void addOrder(String order) {
        orders.add(order);
    }

    public void removeOrder(String order) {
        orders.remove(order);
    }

    // Reporting
    public void generateReport() {
        System.out.println("Users: " + users);
        System.out.println("Orders: " + orders);
    }
}
