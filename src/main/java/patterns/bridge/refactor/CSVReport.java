package patterns.bridge.refactor;

public class CSVReport extends StockReport {
    public CSVReport(DataSource dataSource) { super(dataSource); }
    @Override
    public void generateReport() {
        System.out.println("CSV Report: " + dataSource.getStockData());
    }
}