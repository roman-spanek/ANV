package patterns.bridge.refactor;

public class JSONReport extends StockReport {
    public JSONReport(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void generateReport() {
        String[] stocks = dataSource.getStockData().split(",");
        System.out.println("JSON Report: {\"stocks\": [\"" + String.join("\",\"", stocks) + "\"]}");
    }
}
