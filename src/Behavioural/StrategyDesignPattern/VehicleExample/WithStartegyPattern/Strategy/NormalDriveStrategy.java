package Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println(" Normal Drive Capablity");
    }
}
