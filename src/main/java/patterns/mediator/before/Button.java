package patterns.mediator.before;

import lombok.Setter;

@Setter
public class  Button {
    private boolean enabled;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Register button " + (enabled ? "enabled" : "disabled"));
    }
}