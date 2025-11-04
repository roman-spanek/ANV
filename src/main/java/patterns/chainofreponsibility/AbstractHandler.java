package patterns.chainofreponsibility;

public abstract class AbstractHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    protected void next(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}