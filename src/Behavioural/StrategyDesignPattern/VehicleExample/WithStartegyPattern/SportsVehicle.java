package Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern;

import Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
