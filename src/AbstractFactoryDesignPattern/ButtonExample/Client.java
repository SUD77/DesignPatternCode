package AbstractFactoryDesignPattern.ButtonExample;

public class Client {

    public static void main(String[] args) {

        String osType="Mac";

        FactoryTemplate factory=AbstractFactory.createFactory(osType);

        ButtonTemplate button=factory.createButton();
        button.press();

        TextBoxTemplate textBox=factory.createTextBox();
        textBox.showText();

    }
}
