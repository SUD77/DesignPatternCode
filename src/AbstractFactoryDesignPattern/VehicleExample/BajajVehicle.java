package AbstractFactoryDesignPattern.VehicleExample;

public class BajajVehicle implements Vehicle{
    @Override
    public void vehicleInfo() {
        System.out.println(
                "Bajaj Vehicle"
        );
    }
}
