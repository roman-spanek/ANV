package patterns.mediator.refactored;

public interface Mediator {
    void notify(Component sender, String event);
}