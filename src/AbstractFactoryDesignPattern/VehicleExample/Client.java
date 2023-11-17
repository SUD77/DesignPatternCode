package AbstractFactoryDesignPattern.VehicleExample;

public class Client {

    public static void main(String[] args) {

        Factory factory=AbstractFactory.createVehicleFactory("Honda");

        factory.createVehicle().vehicleInfo();
    }
}
