package clean.code.example.refactor;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CartMemento {
    private final List<Product> products = new ArrayList<>();
    private final LocalDateTime timestamp;

    public CartMemento(List<Product> products) {
        // Deep copy
        for (Product p : products) {
            this.products.add(p.clone());
        }
        this.timestamp = LocalDateTime.now();
    }
}
