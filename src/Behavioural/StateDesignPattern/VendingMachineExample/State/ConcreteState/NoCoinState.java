package Behavioural.StateDesignPattern.VendingMachineExample.State.ConcreteState;

import Behavioural.StateDesignPattern.VendingMachineExample.State.VendingMachineState;

public class NoCoinState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Coin inserted.");
    }

    public void pressButton() {
        System.out.println("Please insert a coin first.");
    }

    public void dispense() {
        System.out.println("Insert coin and press button to dispense.");
    }
}
