package pr.pr02.products.builder;

import patterns.builder.components.Engine;

public interface Builder {
    void setSeats(int seats);
    void setEngine(Engine engine);
}
