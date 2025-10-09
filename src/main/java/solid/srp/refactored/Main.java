package solid.srp.refactored;

// Použití
public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        ReportSaver saver = new ReportSaver();
        ReportPrinter printer = new ReportPrinter();

        String report = generator.generateReport();
        saver.saveToFile(report);
        printer.printReport(report);
    }
}
