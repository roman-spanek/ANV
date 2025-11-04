package pr.pr6;

public abstract class Action {

    protected int priority;
    private final Action next;

    public Action(Action next) {
        this.next = next;
    }
    public void process(Request request){
        if (this.priority < request.getPriority()) {
            System.out.println("Processing high priority request");
            if (next != null) {
                next.process(request);
            }
        }else{
            return;
        }
    }
}
