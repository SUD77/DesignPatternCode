package Behavioural.StrategyDesignPattern.TravelRouteExample.StrategyImpl;

import Behavioural.StrategyDesignPattern.TravelRouteExample.RouteStrategy;

public class BikeRoute implements RouteStrategy {
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Calculating shortest route for BIKE from " + source + " to " + destination);
    }
}
