package Creational.AbstractFactoryDesignPattern.ButtonExample;

public interface FactoryTemplate {

    ButtonTemplate createButton();
    TextBoxTemplate createTextBox();

}
