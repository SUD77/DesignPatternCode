package Creational.AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public interface FactoryTemplate {

    MouseTemplate createMouse();
    KeyboardTemplate createKeyboard();
}
