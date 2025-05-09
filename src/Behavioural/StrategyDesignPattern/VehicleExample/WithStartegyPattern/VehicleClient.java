package Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern;

public class VehicleClient {
    public static void main(String[] args) {

        Vehicle vehicle=new SportsVehicle();
        vehicle.drive();
    }
}
