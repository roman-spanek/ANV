package patterns.observer;

public class Demo {

    public static void main(String[] args) {
        Store store = new Store("iPhone 16");

        Observer customer1 = new Customer("Alice");
        Observer customer2 = new Customer("Bob");
        Observer customer3 = new Customer("Charlie");

        store.addObserver(customer1);
        store.addObserver(customer2);
        store.addObserver(customer3);

        store.setAvailable(false); // žádná dostupnost
        store.setAvailable(true);  // notifikace všem
    }
}