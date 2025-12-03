package patterns.adapter.refactor;

// Legacy XML service
public class XMLStockService {
    public String getStockDataXML() {
        return "<stocks><stock>APPL</stock><stock>GOOGL</stock></stocks>";
    }
}