package patterns.mediator.refactored;

public class  RegistrationDialog implements Mediator {
    private TextBox textBox;
    private CheckBox checkBox;
    private Button button;

    public void setComponents(TextBox textBox, CheckBox checkBox, Button button) {
        this.textBox = textBox;
        this.checkBox = checkBox;
        this.button = button;
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("textChanged") || event.equals("checkedChanged")) {
            boolean canRegister = !textBox.getText().isEmpty() && checkBox.isChecked();
            button.setEnabled(canRegister);
        }
    }
}