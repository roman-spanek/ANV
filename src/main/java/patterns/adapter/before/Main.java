package patterns.adapter.before;

public class Main {
    public static void main(String[] args) {
        XMLStockService xmlService = new XMLStockService();
        AnalyticsLibrary analytics = new AnalyticsLibrary();

        // We have XML, but AnalyticsLibrary wants JSON
        String xmlData = xmlService.getStockDataXML();

        // Problem: we need to manually convert XML to JSON each time
        String fakeJson = "{\"stocks\": [\"APPL\", \"GOOGL\"]}"; // manual conversion
        analytics.processJSON(fakeJson);

        // This is repetitive and error-prone if we have many calls
    }
}
