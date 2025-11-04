package patterns.strategy.ex1;

public class PayByCash implements PayStrategy {

    @Override
    public void collectPaymentDetails() {
        System.out.println("Just a cash payment");
    }

    @Override
    public boolean pay(int paymentAmount) {
        return true;
    }

}