package Creational.AbstractFactoryDesignPattern.ButtonExample;

public class WindowsButton implements ButtonTemplate{
    @Override
    public void press() {
        System.out.println("Windows button is pressed");
    }
}
