package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String productName;
    private boolean available;

    public Store(String productName) {
        this.productName = productName;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(productName, available));
    }

    // Změna stavu – např. produkt se stal dostupným
    public void setAvailable(boolean available) {
        this.available = available;
        System.out.println("\nStore: " + productName + " is now " +
                (available ? "available!" : "not available."));
        notifyObservers();
    }
}

