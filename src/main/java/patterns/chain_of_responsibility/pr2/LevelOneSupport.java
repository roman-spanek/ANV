package patterns.chain_of_responsibility.pr2;

public class LevelOneSupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Ticket ticket) {
        if (ticket.getSeverity() == 1) {
            System.out.println("Level One Support resolved: " + ticket.getIssue());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
