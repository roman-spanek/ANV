package cv;

public class ShipFactory extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
