package Creational.AbstractFactoryDesignPattern.ButtonExample;

public class WindowsTextBox implements TextBoxTemplate {
    @Override
    public void showText() {
        System.out.println("Showing Windows TextBox");
    }
}
