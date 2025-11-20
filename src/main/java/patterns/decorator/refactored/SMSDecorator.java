package patterns.decorator.refactored;

public class SMSDecorator extends NotifierDecorator {
    private final String phone;

    public SMSDecorator(Notifier wrapper, String phone) {
        super(wrapper);
        this.phone = phone;
    }


    @Override
    void decorate() {
        System.out.println("Sending SMS message");
    }
}
