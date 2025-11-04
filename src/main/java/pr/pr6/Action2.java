package pr.pr6;

public class Action2 extends Action {

    private final Action next;

    public Action2(Action next, int priority) {
        super(next);
        this.priority = priority;
        this.next = next;
    }

}
