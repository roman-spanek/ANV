package pr.pr6.strategy;

public class PublicTransportStrategy implements RoutingStrategy{
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building public transport route from " + start + " to " + end);
    }
}
