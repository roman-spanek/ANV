package refactoring.before;

public class BeforeDemo {
    public static void main(String[] args) {
        BadTextEditor editor = new BadTextEditor();
        editor.notifyUI("Starting...");
        editor.format("upper", "hello world");
        editor.save("xml", "hello world");
    }
}
/*
What is wrong?
Huge if-else blocks → violates Open–Closed
Strong coupling between UI, formatting, saving → violates Single Responsibility
Hard to extend (e.g., new formats, new save formats)
No events → UI and business logic are glued together
 */