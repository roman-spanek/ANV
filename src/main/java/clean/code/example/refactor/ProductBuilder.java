package clean.code.example.refactor;

public class ProductBuilder {
    private String name;
    private double price;

    public ProductBuilder setName(String name) { this.name = name; return this; }
    public ProductBuilder setPrice(double price) { this.price = price; return this; }
    public Product build() { return new Product(name, price); }
}
