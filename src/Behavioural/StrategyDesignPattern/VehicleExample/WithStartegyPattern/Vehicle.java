package Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern;

import Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
