package patterns.composite.composite_vs_inheritance.composition;

public class GasolineEngine  implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline engine starting");
    }
}
