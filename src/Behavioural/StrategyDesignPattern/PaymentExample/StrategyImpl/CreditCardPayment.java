package Behavioural.StrategyDesignPattern.PaymentExample.StrategyImpl;

import Behavioural.StrategyDesignPattern.PaymentExample.PaymentStrategy;

// Step 2: Implement concrete strategy classes
public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using credit card: " + cardNumber);
    }
}
