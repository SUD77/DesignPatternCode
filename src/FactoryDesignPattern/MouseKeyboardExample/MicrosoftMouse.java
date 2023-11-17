package FactoryDesignPattern.MouseKeyboardExample;

public class MicrosoftMouse implements Mouse{
    @Override
    public void createMouse() {
        System.out.println("Microsoft Mouse is produced");
    }
}
