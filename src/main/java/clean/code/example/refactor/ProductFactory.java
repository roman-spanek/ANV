package clean.code.example.refactor;

public class ProductFactory {
    static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "laptop": return new Product("Laptop", 1000);
            case "phone": return new Product("Phone", 500);
            default: throw new IllegalArgumentException("Unknown product type");
        }
    }
}