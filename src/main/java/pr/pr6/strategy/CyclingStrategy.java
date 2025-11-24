package pr.pr6.strategy;

public class CyclingStrategy  implements RoutingStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building cycling route from " + start + " to " + end);
    }
}
