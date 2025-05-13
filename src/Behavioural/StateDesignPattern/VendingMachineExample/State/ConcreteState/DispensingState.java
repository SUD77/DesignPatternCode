package Behavioural.StateDesignPattern.VendingMachineExample.State.ConcreteState;

import Behavioural.StateDesignPattern.VendingMachineExample.State.VendingMachineState;

public class DispensingState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Wait! Dispensing in progress.");
    }

    public void pressButton() {
        System.out.println("Already dispensing...");
    }

    public void dispense() {
        System.out.println("Already dispensing the item.");
    }
}
