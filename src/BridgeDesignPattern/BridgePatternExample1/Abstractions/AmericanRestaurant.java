package BridgeDesignPattern.BridgePatternExample1.Abstractions;

import BridgeDesignPattern.BridgePatternExample1.Implementation.Pizza;

public class AmericanRestaurant extends Restaurant {


    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void resType() {
        System.out.println("From AmericanRestaurant : ");
    }


}
