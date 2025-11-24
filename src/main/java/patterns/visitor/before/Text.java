package patterns.visitor.before;

import lombok.Data;

@Data
public class  Text {
    private final String content;

    // Export methods directly in the class
    public void exportAsPlainText() {
        System.out.println("Text: " + content);
    }

    public void exportAsXML() {
        System.out.println("<text>" + content + "</text>");
    }
}

















/*
Problems With This Approach

Violates Single Responsibility Principle (SRP):
Each element class now handles both its data and multiple export behaviors.

Violates Open/Closed Principle (OCP):
Adding a new export format (like JSON) requires modifying every element class, which risks breaking existing code.

Code Duplication / DRY Violation:
The client code has repetitive instanceof checks and type casting for every operation.

Hard to Maintain:
Adding new element types (like Chart or Video) forces modifications to both client code and export logic in every class.

Poor Readability:
Complex if-else chains or instanceof checks clutter the client code, making it hard to follow.
 */