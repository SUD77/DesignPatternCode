package Creational.AbstractFactoryDesignPattern.ButtonExample;

public class MacFactory implements FactoryTemplate{
    @Override
    public ButtonTemplate createButton() {
        return new MacButton();
    }

    @Override
    public TextBoxTemplate createTextBox() {
        return new MacTextBox();
    }
}
