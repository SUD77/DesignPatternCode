package Creational.AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class MicrosoftFactory implements FactoryTemplate{
    @Override
    public MouseTemplate createMouse() {
        return new MicrosoftMouse();
    }

    @Override
    public KeyboardTemplate createKeyboard() {
        return new MicrosoftKeyboard();
    }
}
