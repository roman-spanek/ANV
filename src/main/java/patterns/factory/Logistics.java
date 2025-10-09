package patterns.factory;

public abstract class Logistics {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    // Factory Method
    protected abstract Transport createTransport();
}

