package Behavioural.StrategyDesignPattern.TravelRouteExample.StrategyImpl;

import Behavioural.StrategyDesignPattern.TravelRouteExample.RouteStrategy;

public class WalkRoute implements RouteStrategy {
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Calculating safest route for walking from " + source + " to " + destination);
    }
}
