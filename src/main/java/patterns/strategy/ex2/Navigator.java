package patterns.strategy.ex2;

import lombok.Setter;

@Setter
public class Navigator {
    private RoutingStrategy strategy;

    public void buildRoute(String origin, String destination) {
        if (strategy == null) {
            throw new IllegalStateException("Routing strategy not set!");
        }
        strategy.buildRoute(origin, destination);
    }
}
