package patterns.decorator.refactored;

public class SlackDecorator extends NotifierDecorator {
    private final String user;

    public SlackDecorator(Notifier wrapper, String user) {
        super(wrapper);
        this.user = user;
    }


    @Override
    void decorate() {
        System.out.println("Sending Slack message to " + user );
    }
}