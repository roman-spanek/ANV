package patterns.bridge.refactor;

public abstract class StockReport {
    protected DataSource dataSource;

    public StockReport(DataSource dataSource) { this.dataSource = dataSource; }

    abstract void generateReport();
}
