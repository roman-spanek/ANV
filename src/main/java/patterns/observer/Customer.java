package patterns.observer;

public class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, boolean available) {
        System.out.println("Notification for " + name + ": Product '" +
                productName + "' is " + (available ? "available now!" : "unavailable."));
    }
}

