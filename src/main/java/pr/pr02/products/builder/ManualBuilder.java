package pr.pr02.products.builder;

import patterns.builder.components.Engine;
import pr.pr02.products.ManualCar;

public class ManualBuilder implements Builder {
    private int seats;
    private Engine engine;
    private int fuel = 0;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ManualCar buildManualCar() {
        return new ManualCar(seats, engine, fuel);
    }
}
