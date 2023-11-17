package FactoryDesignPattern.VehicleExample.Factory;

public class Bike implements Vehicle {
    @Override
    public void producingThisVehicle() {
        System.out.println("Bike Produced");
    }
}
