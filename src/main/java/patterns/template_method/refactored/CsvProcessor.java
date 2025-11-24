package patterns.template_method.refactored;

public class CsvProcessor extends DataProcessor {
    @Override
    protected void readFile() {
        System.out.println("Reading CSV file");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data");
    }

}
