package Creational.AbstractFactoryDesignPattern.ButtonExample;

public class MacTextBox implements TextBoxTemplate {
    @Override
    public void showText() {
        System.out.println("Showing Mac textbox");
    }
}
