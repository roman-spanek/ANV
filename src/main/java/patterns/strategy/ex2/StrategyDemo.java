package patterns.strategy.ex2;

public class StrategyDemo {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        // Using car route
        navigator.setStrategy(new CarRouteStrategy());
        navigator.buildRoute("Home", "Airport");

        // Using walking route
        navigator.setStrategy(new WalkingRouteStrategy());
        navigator.buildRoute("Home", "Park");

        // Using public transport route
        navigator.setStrategy(new PublicTransportRouteStrategy());
        navigator.buildRoute("Home", "Museum");
    }
}
