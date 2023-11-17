package AbstractFactoryDesignPattern.VehicleExample;

public class HondaFactory implements Factory{
    @Override
    public Vehicle createVehicle() {
        return new HondaVehicle();
    }
}
