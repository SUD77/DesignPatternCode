package Behavioural.StrategyDesignPattern.TravelRouteExample.StrategyImpl;

import Behavioural.StrategyDesignPattern.TravelRouteExample.RouteStrategy;

public class CarRoute implements RouteStrategy {
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Calculating fastest route by CAR from " + source + " to " + destination);
    }
}
