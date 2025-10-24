package pr.pr05;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store();

        Customer customer1 = new Customer("Me");
        Customer customer2 = new Customer("You");

        store.addObserver(customer1);
        store.addObserver(customer2);
        store.addNewItem();
    }
}
