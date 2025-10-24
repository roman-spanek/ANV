package patterns.chain_of_responsibility.pr2;

public class Ticket {
    private final String issue;
    private final int severity; // 1 = low, 2 = medium, 3 = high

    public Ticket(String issue, int severity) {
        this.issue = issue;
        this.severity = severity;
    }

    public String getIssue() { return issue; }
    public int getSeverity() { return severity; }
}