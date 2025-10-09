package pr.pr02.products.builder;

import patterns.builder.components.Engine;
import pr.pr02.products.Car;

public class CarBuilder implements  Builder {
    private int seats;
    private Engine engine;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    public Car build() {
        return new Car(seats, engine);
    }
}
