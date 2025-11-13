package patterns.template_method.before;

public class CsvProcessor {
    public void process() {
        // Step 1: Read file
        System.out.println("Reading CSV file");

        // Step 2: Parse file
        System.out.println("Parsing CSV data");

        // Step 3: Analyze data
        System.out.println("Analyzing data");

        // Step 4: Generate report
        System.out.println("Generating report from CSV");
    }
}

