package Structural.DecoratorDesignPattern.CoffeExample.Component;

public class BasicCoffee implements Coffee{
    public String getDescription() {
        return "Basic Coffee";
    }

    public double getCost() {
        return 2.0;
    }
}
