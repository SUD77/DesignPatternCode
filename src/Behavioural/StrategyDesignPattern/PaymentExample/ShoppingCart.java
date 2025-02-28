package Behavioural.StrategyDesignPattern.PaymentExample;

// Step 3: Create a context class that uses the strategy. Here, shoppingCart is the context class
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
