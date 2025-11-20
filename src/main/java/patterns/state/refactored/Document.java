package patterns.state.refactored;

import lombok.Getter;
import lombok.Setter;

public class Document {
    @Setter
    private State state;
    @Getter
    private String currentUserRole;

    public Document(String currentUserRole) {
        this.currentUserRole = currentUserRole;
        this.state = new DraftState(); // počáteční stav
    }

    public void publish() {
        state.publish(this);
    }

    public void edit() {
        state.edit(this);
    }
}