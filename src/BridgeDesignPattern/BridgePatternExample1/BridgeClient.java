package BridgeDesignPattern.BridgePatternExample1;

import BridgeDesignPattern.BridgePatternExample1.Abstractions.AmericanRestaurant;
import BridgeDesignPattern.BridgePatternExample1.Abstractions.ItalianRestaurant;
import BridgeDesignPattern.BridgePatternExample1.Abstractions.Restaurant;
import BridgeDesignPattern.BridgePatternExample1.Implementation.NonVeggiePizza;
import BridgeDesignPattern.BridgePatternExample1.Implementation.VeggiePizza;

public class BridgeClient {

    public static void main(String[] args) {

        Restaurant americanRestaurant=new AmericanRestaurant(new NonVeggiePizza());
        americanRestaurant.deliver();

        System.out.println();

        Restaurant italianRestaurant=new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }
}
