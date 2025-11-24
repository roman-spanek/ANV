package patterns.strategy.ex2;

public class PublicTransportRouteStrategy implements RoutingStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building optimal public transport route from " + origin + " to " + destination);
    }
}