package patterns.template_method.refactored;

public abstract class DataProcessor {
    // Template method (final so subclasses can't override the algorithm structure)
    public final void process() {
        readFile();
        parseData();
        analyzeData();
        generateReport();
    }

    // Steps that can vary
    protected abstract void readFile();
    protected abstract void parseData();

    // Common steps
    protected void analyzeData() {
        System.out.println("Analyzing data");;;;;;
    }

    protected void generateReport() {
        System.out.println("Generating report");;;;;
    }
}