package patterns.mediator.refactored;

public class  Button extends Component {
    private boolean enabled;

    public Button(Mediator mediator) {
        super(mediator);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Register button " + (enabled ? "enabled" : "disabled"));
    }
}

