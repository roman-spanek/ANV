package pr.pr6.strategy;

public class DemoStrategy {
    public static void main(String[] args) {
        RoutingStrategy cycling = new CyclingStrategy();

        Navigation navigation = new Navigation();
        navigation.buildRoute("Point A", "Point B", cycling);

        PublicTransportStrategy  publicTransportStrategy = new PublicTransportStrategy();
        navigation.buildRoute("Point A", "Point B", publicTransportStrategy);

    }
}
