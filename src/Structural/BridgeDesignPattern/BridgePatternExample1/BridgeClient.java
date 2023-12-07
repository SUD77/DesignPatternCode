package Structural.BridgeDesignPattern.BridgePatternExample1;

import Structural.BridgeDesignPattern.BridgePatternExample1.Abstractions.AmericanRestaurant;
import Structural.BridgeDesignPattern.BridgePatternExample1.Abstractions.ItalianRestaurant;
import Structural.BridgeDesignPattern.BridgePatternExample1.Abstractions.Restaurant;
import Structural.BridgeDesignPattern.BridgePatternExample1.Implementation.NonVeggiePizza;
import Structural.BridgeDesignPattern.BridgePatternExample1.Implementation.VeggiePizza;

public class BridgeClient {

    public static void main(String[] args) {

        Restaurant americanRestaurant=new AmericanRestaurant(new NonVeggiePizza());
        americanRestaurant.deliver();

        System.out.println();

        Restaurant italianRestaurant=new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }
}
