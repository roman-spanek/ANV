package patterns.mediator.refactored;

import lombok.Getter;

@Getter
public class TextBox extends Component {
    private String text = "";

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Username entered: " + text);
        mediator.notify(this, "textChanged");
    }
}