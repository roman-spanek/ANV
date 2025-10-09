package solid.srp;

class Report {
    public String generateReport() {
        return "Report content";
    }

    public void saveToFile(String content) {
        // logika pro uložení do souboru
        System.out.println("Saving report: " + content);
    }

    public void printReport(String content) {
        // logika pro tisk
        System.out.println("Printing report: " + content);
    }
}
