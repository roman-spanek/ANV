package patterns.adapter.refactor;

public class TXTtoJSONAdapter implements JSONStockProvider {
    private final TXTStockService txtService;

    public TXTtoJSONAdapter(TXTStockService txtService) {
        this.txtService = txtService;
    }

    @Override
    public String getStockDataJSON() {
        String txtData = txtService.getStockDataTXT();
        String[] lines = txtData.split("\n");
        StringBuilder json = new StringBuilder("{\"stocks\": [");
        for (int i = 0; i < lines.length; i++) {
            String[] parts = lines[i].split(": ");
            json.append("\"").append(parts[1]).append("\"");
            if (i < lines.length - 1) json.append(",");
        }
        json.append("]}");
        return json.toString();
    }
}
