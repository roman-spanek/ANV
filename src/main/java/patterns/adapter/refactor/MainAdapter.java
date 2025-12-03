package patterns.adapter.refactor;

public class MainAdapter {
    public static void main(String[] args) {
        //v1
        XMLStockService xmlService = new XMLStockService();
        JSONStockProvider adapter = new XMLtoJSONAdapter(xmlService);
        AnalyticsLibrary analytics = new AnalyticsLibrary();

        // Client just calls adapter
        analytics.processJSON(adapter.getStockDataJSON());

/*
        //v2
        AnalyticsLibrary analytics = new AnalyticsLibrary();

        // XML source
        JSONStockProvider xmlAdapter = new XMLtoJSONAdapter(new XMLStockService());
        analytics.processJSON(xmlAdapter.getStockDataJSON());

        // CSV source
        JSONStockProvider csvAdapter = new CSVtoJSONAdapter(new CSVStockService());
        analytics.processJSON(csvAdapter.getStockDataJSON());

        // TXT source
        JSONStockProvider txtAdapter = new TXTtoJSONAdapter(new TXTStockService());
        analytics.processJSON(txtAdapter.getStockDataJSON());

 */
    }
}
