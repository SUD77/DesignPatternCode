package Creational.AbstractFactoryDesignPattern.ButtonExample;

public class MacButton implements ButtonTemplate{
    @Override
    public void press() {
        System.out.println("Mac button is pressed");
    }
}
