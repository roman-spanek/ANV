package patterns.factory;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering cargo by land in a truck.");
    }
}
