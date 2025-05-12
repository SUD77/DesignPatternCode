package Structural.DecoratorDesignPattern.CoffeExample.Decorator;

import Structural.DecoratorDesignPattern.CoffeExample.Component.Coffee;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
