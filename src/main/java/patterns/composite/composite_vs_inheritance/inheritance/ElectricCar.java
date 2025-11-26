package patterns.composite.composite_vs_inheritance.inheritance;

public class ElectricCar extends Vehicle {
    @Override
    void start() {
        System.out.println("Electric car starting silently");
    }
}
