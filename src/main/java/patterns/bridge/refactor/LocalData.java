package patterns.bridge.refactor;

public class LocalData implements DataSource {
    @Override
    public String getStockData() { return "APPL,GOOGL"; }
}