package patterns.adapter.refactor;

public class CSVtoJSONAdapter implements JSONStockProvider {
    private final CSVStockService csvService;

    public CSVtoJSONAdapter(CSVStockService csvService) {
        this.csvService = csvService;
    }

    @Override
    public String getStockDataJSON() {
        String csvData = csvService.getStockDataCSV();
        String[] stocks = csvData.split(",");
        return "{\"stocks\": [\"" + String.join("\",\"", stocks) + "\"]}";
    }
}
