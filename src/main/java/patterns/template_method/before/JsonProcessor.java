package patterns.template_method.before;

public class JsonProcessor {
    public void process() {
        // Step 1: Read file
        System.out.println("Reading JSON file");

        // Step 2: Parse file
        System.out.println("Parsing JSON data");

        // Step 3: Analyze data
        System.out.println("Analyzing data");

        // Step 4: Generate report
        System.out.println("Generating report from JSON");
    }
}