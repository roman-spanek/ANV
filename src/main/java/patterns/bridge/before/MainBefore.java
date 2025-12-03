package patterns.bridge.before;

public class MainBefore {
    public static void main(String[] args) {
        LocalJSONReport r1 = new LocalJSONReport();
        r1.generateReport();

        RemoteCSVReport r2 = new RemoteCSVReport();
        r2.generateReport();
    }
}

/*

Problems:

Class explosion: 2 data sources × 3 formats = 6 classes already. Imagine 5 sources × 5 formats = 25 classes!

Hard to maintain: Adding a new format or data source requires new classes for every combination.

Violates Open/Closed Principle: changes force class duplication.
 */
