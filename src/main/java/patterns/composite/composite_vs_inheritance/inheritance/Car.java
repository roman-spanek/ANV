package patterns.composite.composite_vs_inheritance.inheritance;

public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car with gasoline engine starting");
    }
}