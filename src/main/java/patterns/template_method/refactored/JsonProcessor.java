package patterns.template_method.refactored;

public class JsonProcessor extends DataProcessor {
    @Override
    protected void readFile() {
        System.out.println("Reading JSON file");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data");
    }
}
