package AbstractFactoryDesignPattern.MouseKeyboardAbsFactExample;

public class AbstractFactory {

    static FactoryTemplate createFactory(String companyName){

        if(companyName.equals("Apple")){
            return new AppleFactory();
        }else {
            return new MicrosoftFactory();
        }
    }
}
