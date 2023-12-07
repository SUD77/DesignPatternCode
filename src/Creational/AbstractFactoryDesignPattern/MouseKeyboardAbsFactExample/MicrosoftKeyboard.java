package Creational.AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class MicrosoftKeyboard implements KeyboardTemplate{
    @Override
    public void keyboardProperties() {
        System.out.println("Microsoft Keyboard is produced");
    }
}
