package patterns.visitor.refactored;

import java.util.Arrays;
import java.util.List;

public  class VisitorDemo {
    public static void main(String[] args) {
        List<DocumentElement> elements = Arrays.asList(
                new Text("Hello World"),
                new Image("/images/picture.png"),
                new Table(3, 4)
        );

        System.out.println("Exporting as plain text:");
        DocumentVisitor plainTextExporter = new PlainTextExporter();
        elements.forEach(element -> element.accept(plainTextExporter));

        System.out.println("\nExporting as XML:");
        DocumentVisitor xmlExporter = new XMLExporter();
        elements.forEach(element -> element.accept(xmlExporter));
    }
}

/*
Benefits & Clean Code Principles Demonstrated

Single Responsibility Principle (SRP):
Each element class (Text, Image, Table) focuses only on storing data, while visitors handle different export behaviors.

Open/Closed Principle (OCP):
New operations (like JSON export) can be added by creating a new visitor without modifying existing element classes.

DRY (Don't Repeat Yourself):
Export logic is centralized in visitors, avoiding duplication in element classes.

Improved Readability:
Each class has a clear responsibility, and the flow of operations (accepting a visitor) is easy to follow.
 */