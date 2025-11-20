package patterns.decorator.refactored;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapper;

    public NotifierDecorator(Notifier wrappee) {
        this.wrapper = wrappee;
    }

    @Override
    public void send(String message) {
        wrapper.send(message); // Delegace na obalený objekt
        decorate();
    }

    abstract void decorate();
}
