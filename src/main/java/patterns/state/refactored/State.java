package patterns.state.refactored;

public interface State {
    void publish(Document context);
    void edit(Document context);
}
