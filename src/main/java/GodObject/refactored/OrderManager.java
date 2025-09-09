package GodObject.refactored;

import java.util.ArrayList;
import java.util.List;

class OrderManager {
    private List<String> orders = new ArrayList<>();

    public void addOrder(String order) {
        orders.add(order);
    }

    public void removeOrder(String order) {
        orders.remove(order);
    }

    public List<String> getOrders() {
        return orders;
    }
}
