package pr.pr6.strategy;

public class Navigation {
    private RoutingStrategy strategy;

    public void buildRoute(String start, String end, RoutingStrategy strategy) {
        strategy.buildRoute(start, end);
    }
}
