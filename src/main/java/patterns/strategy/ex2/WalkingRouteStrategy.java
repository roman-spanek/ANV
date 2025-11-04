package patterns.strategy.ex2;

public class WalkingRouteStrategy implements RoutingStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building scenic walking route from " + origin + " to " + destination);
    }
}
