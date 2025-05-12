package Structural.DecoratorDesignPattern.CoffeExample.Decorator;

import Structural.DecoratorDesignPattern.CoffeExample.Component.Coffee;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }
}
