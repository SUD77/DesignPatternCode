package FactoryDesignPattern.VehicleExample.Normal;

public class Car implements Vehicle {
    @Override
    public void producingThisVehicle() {

        System.out.println("Car produced");
    }
}
