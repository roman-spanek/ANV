package cv;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }

    protected abstract Transport createTransport();
}
