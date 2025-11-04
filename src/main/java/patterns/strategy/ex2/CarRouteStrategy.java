package patterns.strategy.ex2;

public class CarRouteStrategy implements RoutingStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building fastest car route from " + origin + " to " + destination);
    }
}
