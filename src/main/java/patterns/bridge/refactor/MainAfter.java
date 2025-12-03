package patterns.bridge.refactor;

public class MainAfter {
    public static void main(String[] args) {
        StockReport r1 = new JSONReport(new LocalData());
        r1.generateReport();

        StockReport r2 = new CSVReport(new RemoteData());
        r2.generateReport();

        StockReport r3 = new TXTReport(new LocalData());
        r3.generateReport();
    }
}

/*
Benefits with Bridge:

No class explosion: 3 formats + 2 data sources = only 5 classes.

Open/Closed Principle: Add new format or data source without touching existing classes.

Flexible and maintainable: Any combination is easy to create at runtime.

Polymorphism + Composition: Report and DataSource are decoupled.
 */
