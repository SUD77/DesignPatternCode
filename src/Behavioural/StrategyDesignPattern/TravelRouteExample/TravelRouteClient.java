package Behavioural.StrategyDesignPattern.TravelRouteExample;

import Behavioural.StrategyDesignPattern.TravelRouteExample.StrategyImpl.BikeRoute;
import Behavioural.StrategyDesignPattern.TravelRouteExample.StrategyImpl.CarRoute;

/*
*  This is basically a demo client, i.e. from UI , you are asking about
* the route between two places through different vehicles
* */
public class TravelRouteClient {

    public static void main(String[] args) {
        NavigationContext context = new NavigationContext();

        // Choosing Car Route
        context.setRouteStrategy(new CarRoute());
        context.navigate("Home", "Office");

        // Switching to Bike Route
        context.setRouteStrategy(new BikeRoute());
        context.navigate("Home", "Gym");
    }
}
