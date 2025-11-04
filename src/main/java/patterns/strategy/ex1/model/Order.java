package patterns.strategy.ex1.model;

import patterns.strategy.ex1.PayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    /**
     * Order class. Doesn't know the concrete payment method (strategy) user has
     * picked. It uses common strategy interface to delegate collecting payment data
     * to strategy object. It can be used to save order to database.
     */
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}