package AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class MicrosoftMouse implements MouseTemplate{
    @Override
    public void mouseProperties() {
        System.out.println("Microsoft Mouse is produced");
    }
}
