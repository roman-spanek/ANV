package patterns.state.refactored;

public class PublishedState implements State {
    public void publish(Document context) {
        System.out.println("Document is already published.");
    }

    public void edit(Document context) {
        System.out.println("Cannot edit a published document.");
    }
}
