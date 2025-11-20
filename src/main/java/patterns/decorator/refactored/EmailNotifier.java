package patterns.decorator.refactored;

public class EmailNotifier implements Notifier {
    private final String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Email to " + email + ": " + message);
    }
}
