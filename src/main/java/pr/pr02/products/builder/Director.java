package pr.pr02.products.builder;

import patterns.builder.components.Engine;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new Engine(0, 3));
    }

    public void constructSUV(Builder builder) {
        builder.setSeats(7);
        builder.setEngine(new Engine(0, 4));
    }
}
