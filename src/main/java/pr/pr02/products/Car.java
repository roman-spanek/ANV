package pr.pr02.products;

import patterns.builder.components.Engine;

public class Car {
    private int seats;
    private Engine engine;

    public Car(int seats, Engine engine) {
        this.seats = seats;
        this.engine = engine;
    }

}
