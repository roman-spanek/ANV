package patterns.chainofreponsibility;

public interface Handler {
    void setNext(Handler next);
    void handleRequest(Request request);
}
