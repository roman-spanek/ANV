package patterns.adapter.refactor;

public class XMLtoJSONAdapter implements JSONStockProvider {
    private final XMLStockService xmlService;

    public XMLtoJSONAdapter(XMLStockService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getStockDataJSON() {
        String xmlData = xmlService.getStockDataXML();
        // Convert XML to JSON (simplified)
        return "{\"stocks\": [\"APPL\", \"GOOGL\"]}";
    }
}

