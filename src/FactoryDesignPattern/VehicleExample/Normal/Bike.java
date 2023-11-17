package FactoryDesignPattern.VehicleExample.Normal;

public class Bike implements Vehicle{
    @Override
    public void producingThisVehicle() {
        System.out.println("Bike Produced");
    }
}
