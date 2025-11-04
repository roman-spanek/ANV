package patterns.chainofreponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler auth = new AuthenticationHandler();
        Handler authorize = new AuthorizationHandler();
        Handler log = new LoggingHandler();

        log.setNext(auth);
        auth.setNext(authorize);

        System.out.println("---- Test 1 ----");
        log.handleRequest(new Request(null, "admin"));

        System.out.println("\n---- Test 2 ----");
        log.handleRequest(new Request("john", "user"));

        System.out.println("\n---- Test 3 ----");
        log.handleRequest(new Request("anna", "admin"));
    }
}
