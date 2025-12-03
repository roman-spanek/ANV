package patterns.bridge.refactor;

public class RemoteData implements DataSource {
    @Override
    public String getStockData() { return "MSFT,AMZN"; }
}
