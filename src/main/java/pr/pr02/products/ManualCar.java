package pr.pr02.products;

import patterns.builder.components.Engine;

public class ManualCar {
    private int seats;
    private Engine engine;
    private int fuel;

    public ManualCar(int seats, Engine engine, int fuel) {
        this.seats = seats;
        this.engine = engine;
        this.fuel = fuel;
    }
}
