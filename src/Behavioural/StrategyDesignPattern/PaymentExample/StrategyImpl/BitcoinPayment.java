package Behavioural.StrategyDesignPattern.PaymentExample.StrategyImpl;

import Behavioural.StrategyDesignPattern.PaymentExample.PaymentStrategy;

// Step 2: Implement concrete strategy classes
public class BitcoinPayment implements PaymentStrategy {

    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Bitcoin address: " + bitcoinAddress);
    }
}
