package Behavioural.StateDesignPattern.VendingMachineExample.Context;

import Behavioural.StateDesignPattern.VendingMachineExample.State.ConcreteState.DispensingState;
import Behavioural.StateDesignPattern.VendingMachineExample.State.ConcreteState.HasCoinState;
import Behavioural.StateDesignPattern.VendingMachineExample.State.ConcreteState.NoCoinState;
import Behavioural.StateDesignPattern.VendingMachineExample.State.VendingMachineState;

public class VendingMachine {
    private VendingMachineState currentState;

    private VendingMachineState noCoinState = new NoCoinState();
    private VendingMachineState hasCoinState = new HasCoinState();
    private VendingMachineState dispensingState = new DispensingState();

    public VendingMachine() {
        currentState = noCoinState;
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
        if (currentState instanceof NoCoinState) {
            setState(hasCoinState);
        }
    }

    public void pressButton() {
        currentState.pressButton();
        if (currentState instanceof HasCoinState) {
            setState(dispensingState);
            dispense();
        }
    }

    public void dispense() {
        currentState.dispense();
        setState(noCoinState);
    }
}
