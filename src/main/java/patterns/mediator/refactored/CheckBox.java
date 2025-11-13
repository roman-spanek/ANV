package patterns.mediator.refactored;

import lombok.Data;

public class CheckBox extends Component {
    private boolean checked;

    public CheckBox(Mediator mediator) {
        super(mediator);
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        System.out.println("Terms accepted: " + checked);
        mediator.notify(this, "checkedChanged");
    }

    public boolean isChecked() {
        return checked;
    }

}