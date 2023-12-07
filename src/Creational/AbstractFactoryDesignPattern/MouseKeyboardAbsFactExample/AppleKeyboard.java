package Creational.AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class AppleKeyboard implements KeyboardTemplate{
    @Override
    public void keyboardProperties() {
        System.out.println("Apple Keyboard is produced");
    }
}
