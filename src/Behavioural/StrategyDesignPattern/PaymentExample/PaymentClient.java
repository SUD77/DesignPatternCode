package Behavioural.StrategyDesignPattern.PaymentExample;

import Behavioural.StrategyDesignPattern.PaymentExample.StrategyImpl.BitcoinPayment;
import Behavioural.StrategyDesignPattern.PaymentExample.StrategyImpl.CreditCardPayment;
import Behavioural.StrategyDesignPattern.PaymentExample.StrategyImpl.PayPalPayment;

// Step 4: Example usage
public class PaymentClient {

    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card payment strategy
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100);

        // Use PayPal payment strategy
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(50);

        // Use Bitcoin payment strategy
        cart.setPaymentStrategy(new BitcoinPayment("1AbCdEfGhIjK..."));
        cart.checkout(200);
    }
}
