package patterns.mediator.refactored;

public class Main {
    public static void main(String[] args) {
        RegistrationDialog dialog = new RegistrationDialog();

        TextBox textBox = new TextBox(dialog);
        CheckBox checkBox = new CheckBox(dialog);
        Button button = new Button(dialog);

        dialog.setComponents(textBox, checkBox, button);

        textBox.setText("Alice");
        checkBox.setChecked(true);
    }
}
/*
Improvements Explained
Aspect	                Without Mediator	                                With Mediator
Coupling	            Each component directly depends on others	        All components depend only on the Mediator
Reusability	            Components can’t be reused independently            Components can be reused in any dialog or UI
Maintainability	        Adding new logic requires editing multiple classes  Logic centralized in one Mediator class
Clean Code Principles	Violates SRP and OCP	                            Follows SRP (each class has one purpose), OCP (extend via new mediator or components)
Readability	            Hard to follow inter-component logic	            Clear control flow managed in one place
 */