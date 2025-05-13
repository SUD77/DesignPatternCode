package Behavioural.StateDesignPattern.VendingMachineExample.State;

public interface VendingMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}
