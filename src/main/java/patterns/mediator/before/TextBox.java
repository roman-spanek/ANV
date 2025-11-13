package patterns.mediator.before;

import lombok.Data;

@Data
class TextBox {
    private String text = "";
    private CheckBox checkBox;
    private Button button;

    public void setDependencies(CheckBox checkBox, Button button) {
        this.checkBox = checkBox;
        this.button = button;
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Username entered: " + text);
        updateButtonState();
    }

    private void updateButtonState() {
        if (!text.isEmpty() && checkBox != null && checkBox.isChecked()) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }
}