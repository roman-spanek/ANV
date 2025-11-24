package patterns.mediator.before;

public class Main {
    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        CheckBox checkBox = new CheckBox();
        Button button = new Button();

        textBox.setDependencies(checkBox, button);
        checkBox.setDependencies(textBox, button);

        textBox.setText("Alice");
        checkBox.setChecked(true);
    }
}
/*
Problems:
Each component knows too much about the others → tight coupling.

Hard to test or reuse TextBox, CheckBox, or Button independently.

Adding new components requires changing all existing ones.

Violates Single Responsibility and Open/Closed Principles.

 */