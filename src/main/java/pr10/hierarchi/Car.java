package pr10.hierarchi;


public class Car {
    private final Engine engine;

    private int breaks;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {

    }

}
