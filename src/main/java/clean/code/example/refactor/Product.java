package clean.code.example.refactor;

import lombok.Getter;

@Getter
public class Product implements Prototype<Product> {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product clone() {
        return new Product(this.name, this.price);
    }
}