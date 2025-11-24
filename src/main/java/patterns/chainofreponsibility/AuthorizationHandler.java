package patterns.chainofreponsibility;

public class AuthorizationHandler extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (!"admin".equals(request.getRole())) {
            System.out.println("❌ Authorization failed: User not admin.");
            return;
        }
        System.out.println("✅ Authorization successful for role: " + request.getRole());
        next(request);
    }
}