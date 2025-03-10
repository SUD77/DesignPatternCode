package Behavioural.StrategyDesignPattern.PaymentExample.StrategyImpl;

import Behavioural.StrategyDesignPattern.PaymentExample.PaymentStrategy;

// Step 2: Implement concrete strategy classes
public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}
