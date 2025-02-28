package Behavioural.StrategyDesignPattern.TravelRouteExample;

/*

- This is the Context class
- Basically, it sets the strategy demanded by client and calls the function of that strategy.

*/
public class NavigationContext {

    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String source, String destination) {
        routeStrategy.calculateRoute(source, destination);
    }
}
