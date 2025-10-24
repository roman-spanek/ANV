package pr.pr05;

import java.util.HashSet;
import java.util.Set;

public class Store extends Subject{
    private final Set<Observer> observers = new HashSet<>();

    public void addNewItem() {
        StoreItem storeItem = new StoreItem("AXYZ", 10);
        notifyObservers(storeItem);
    }

    @Override
    void notifyObservers(StoreItem storeItem) {
        observers.forEach(observer -> observer.update(storeItem));
    }

    @Override
    void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    void removeObserver(Observer o) {
        observers.remove(o);
    }
}
