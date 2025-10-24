package pr.pr05;

public class StoreItem {
    public String productName;
    public int quantity;
    public StoreItem(String productName, int quantity) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
