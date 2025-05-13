package Behavioural.StateDesignPattern.VendingMachineExample;

import Behavioural.StateDesignPattern.VendingMachineExample.Context.VendingMachine;

public class VendingMachineClient {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.pressButton();     // Should say insert coin
        machine.insertCoin();      // Coin inserted
        machine.pressButton();     // Button pressed, item dispensed
        machine.insertCoin();      // Coin inserted again
    }
}
