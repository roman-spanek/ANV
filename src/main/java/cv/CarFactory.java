package cv;

public class CarFactory extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Car();
    }
}
