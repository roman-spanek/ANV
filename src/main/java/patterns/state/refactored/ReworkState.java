package patterns.state.refactored;

public class ReworkState implements State {
    @Override
    public void publish(Document context) {
        context.setState(new DraftState());
    }

    @Override
    public void edit(Document context) {
        context.setState(new DraftState());
    }
}
