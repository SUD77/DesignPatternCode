package Creational.AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class AppleMouse implements MouseTemplate{
    @Override
    public void mouseProperties() {
        System.out.println("Apple Mouse is produced");
    }
}
