package patterns.composite.composite_vs_inheritance.composition;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine starting silently");
    }
}

