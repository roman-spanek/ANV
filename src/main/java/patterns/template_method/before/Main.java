package patterns.template_method.before;

public class Main {
    public static void main(String[] args) {
        CsvProcessor csvProcessor = new CsvProcessor();
        csvProcessor.process();

        JsonProcessor jsonProcessor = new JsonProcessor();
        jsonProcessor.process();
    }
}

/*
Problems here

Duplicate code in process() (reading, analyzing, generating report).

Adding a new file type would require duplicating all steps again.

Violates DRY (Don't Repeat Yourself) and OCP (Open/Closed Principle).
 */