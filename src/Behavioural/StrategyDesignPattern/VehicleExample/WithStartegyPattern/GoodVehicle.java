package Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern;

import Behavioural.StrategyDesignPattern.VehicleExample.WithStartegyPattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{
    GoodVehicle(){
        super(new NormalDriveStrategy());
    }
}
