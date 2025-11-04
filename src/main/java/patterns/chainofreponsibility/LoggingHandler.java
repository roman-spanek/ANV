package patterns.chainofreponsibility;

public class LoggingHandler extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("📝 Logging request: " + request);
        next(request);
    }
}
