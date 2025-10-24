package pr.pr05;

public class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(StoreItem storeItem) {
        System.out.println("Got update on new item: " + storeItem.productName + " with quantity: " + storeItem.quantity);
    }
}
