package patterns.chainofreponsibility;

public class AuthenticationHandler extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getUser() == null || request.getUser().isEmpty()) {
            System.out.println("❌ Authentication failed: No user provided.");
            return;
        }
        System.out.println("✅ Authentication successful for user: " + request.getUser());
        next(request);
    }
}