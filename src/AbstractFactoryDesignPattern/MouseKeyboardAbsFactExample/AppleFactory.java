package AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class AppleFactory implements FactoryTemplate{
    @Override
    public MouseTemplate createMouse() {
        return new AppleMouse();
    }

    @Override
    public KeyboardTemplate createKeyboard() {
        return new AppleKeyboard();
    }
}
