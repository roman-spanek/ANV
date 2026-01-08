package refactoring.pr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Editor {
    public Collection<EditorSubscriber> subscribers;

    public Editor(){
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(EditorSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyUI(String message) {
        for (EditorSubscriber subscriber : subscribers) {
            subscriber.notifyUI(message);
        }
    }
}
