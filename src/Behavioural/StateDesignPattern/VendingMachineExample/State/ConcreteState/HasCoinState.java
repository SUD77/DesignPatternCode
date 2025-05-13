package Behavioural.StateDesignPattern.VendingMachineExample.State.ConcreteState;

import Behavioural.StateDesignPattern.VendingMachineExample.State.VendingMachineState;

public class HasCoinState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    public void pressButton() {
        System.out.println("Button pressed. Dispensing item...");
    }

    public void dispense() {
        System.out.println("Item dispensed.");
    }
}
