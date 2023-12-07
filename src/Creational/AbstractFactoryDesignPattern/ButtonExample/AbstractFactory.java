package Creational.AbstractFactoryDesignPattern.ButtonExample;

public class AbstractFactory {

    static FactoryTemplate createFactory(String factoryName){

        if(factoryName.equals("Windows")){
            return new WindowsFactory();
        }else {
            return new MacFactory();
        }
    }
}
