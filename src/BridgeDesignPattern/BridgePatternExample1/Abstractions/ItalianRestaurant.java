package BridgeDesignPattern.BridgePatternExample1.Abstractions;

import BridgeDesignPattern.BridgePatternExample1.Implementation.Pizza;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void resType() {
        System.out.println("From Italian Restaurant : ");
    }

}
