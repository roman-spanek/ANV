package pr.pr05;

public abstract class Subject {
    abstract void notifyObservers(StoreItem storeItem);
    abstract void addObserver(Observer o);
    abstract void removeObserver(Observer o);

}
