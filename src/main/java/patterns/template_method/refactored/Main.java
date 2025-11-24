package patterns.template_method.refactored;

public class Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CsvProcessor();
        csvProcessor.process();

        DataProcessor jsonProcessor = new JsonProcessor();
        jsonProcessor.process();
    }
}


/*
Advantages of using Template Method

DRY – common steps (analyzeData, generateReport) are implemented once in the base class.

OCP – adding a new file type only requires creating a new subclass and implementing readFile & parseData.

SRP – each class focuses on a single responsibility:

Base class: defines algorithm structure.

Subclasses: implement file-specific steps.
 */
