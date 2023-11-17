package AbstractFactoryDesignPattern.VehicleExample;

public class BajajFactory implements Factory{
    @Override
    public Vehicle createVehicle() {
        return new BajajVehicle();
    }
}
