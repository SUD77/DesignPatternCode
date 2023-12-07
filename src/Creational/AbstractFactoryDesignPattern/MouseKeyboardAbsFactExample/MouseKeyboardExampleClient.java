package Creational.AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class MouseKeyboardExampleClient {

    public static void main(String[] args) {
        String companyName="Apple";

        FactoryTemplate factory=AbstractFactory.createFactory(companyName);

        MouseTemplate mouse=factory.createMouse();
        mouse.mouseProperties();

        KeyboardTemplate keyboard=factory.createKeyboard();
        keyboard.keyboardProperties();

    }
}
