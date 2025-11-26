package patterns.composite.composite_vs_inheritance.composition;

import lombok.Setter;

@Setter
public class Vehicle {
    // možnost měnit motor dynamicky
    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

}