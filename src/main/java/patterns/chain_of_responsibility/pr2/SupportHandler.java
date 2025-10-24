package patterns.chain_of_responsibility.pr2;

public interface SupportHandler {
    void setNextHandler(SupportHandler nextHandler);
    void handleRequest(Ticket ticket);
}