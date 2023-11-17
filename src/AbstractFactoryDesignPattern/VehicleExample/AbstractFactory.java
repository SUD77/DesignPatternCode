package AbstractFactoryDesignPattern.VehicleExample;

public class AbstractFactory {

    static Factory createVehicleFactory(String companyName){

        if(companyName.equalsIgnoreCase("Honda")){
            return new HondaFactory();
        }else {
            return new BajajFactory();
        }
    }
}
