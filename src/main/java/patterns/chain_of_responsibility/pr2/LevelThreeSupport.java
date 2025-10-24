package patterns.chain_of_responsibility.pr2;

public class LevelThreeSupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Ticket ticket) {
        if (ticket.getSeverity() >= 3) {
            System.out.println("Level Three Support resolved: " + ticket.getIssue());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
