package patterns.strategy.ex1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
