package patterns.bridge.refactor;

public class TXTReport extends StockReport {
    public TXTReport(DataSource dataSource) { super(dataSource); }
    @Override
    public void generateReport() {
        String[] stocks = dataSource.getStockData().split(",");
        System.out.println("TXT Report:");
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Stock " + (i + 1) + ": " + stocks[i]);
        }
    }
}
