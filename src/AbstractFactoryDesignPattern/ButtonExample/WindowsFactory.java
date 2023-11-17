package AbstractFactoryDesignPattern.ButtonExample;

public class WindowsFactory implements FactoryTemplate{


    @Override
    public ButtonTemplate createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBoxTemplate createTextBox() {
        return new WindowsTextBox();
    }
}
