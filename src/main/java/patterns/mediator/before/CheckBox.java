package patterns.mediator.before;

import lombok.Data;

@Data
public class CheckBox {
    private boolean checked;
    private TextBox textBox;
    private Button button;

    public void setDependencies(TextBox textBox, Button button) {
        this.textBox = textBox;
        this.button = button;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        System.out.println("Terms accepted: " + checked);
        updateButtonState();
    }

    private void updateButtonState() {
        if (checked && textBox != null && !textBox.getText().isEmpty()) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }
}

