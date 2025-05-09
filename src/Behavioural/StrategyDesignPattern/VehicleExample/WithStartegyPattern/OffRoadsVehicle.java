package Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern;

import Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern.Strategy.SportsDriveStrategy;

public class OffRoadsVehicle extends Vehicle{
    OffRoadsVehicle(){
        super(new SportsDriveStrategy());
    }
}
