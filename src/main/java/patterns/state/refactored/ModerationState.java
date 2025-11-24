package patterns.state.refactored;

public class ModerationState implements State {
    public void publish(Document context) {
        if("admin".equals(context.getCurrentUserRole())) {
            context.setState(new PublishedState());
            System.out.println("Document published.");
        } else {
            System.out.println("Only admin can publish.");
        }
    }
    public void edit(Document context) {
        System.out.println("Document edited.");
    }
}
