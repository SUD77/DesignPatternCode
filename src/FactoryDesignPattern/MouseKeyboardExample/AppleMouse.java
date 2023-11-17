package FactoryDesignPattern.MouseKeyboardExample;

public class AppleMouse implements Mouse{
    @Override
    public void createMouse() {
        System.out.println("Apple Mouse is Produced");
    }
}
