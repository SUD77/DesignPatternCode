package Structural.DecoratorDesignPattern.CoffeExample;

import Structural.DecoratorDesignPattern.CoffeExample.Component.BasicCoffee;
import Structural.DecoratorDesignPattern.CoffeExample.Component.Coffee;
import Structural.DecoratorDesignPattern.CoffeExample.Decorator.MilkDecorator;
import Structural.DecoratorDesignPattern.CoffeExample.Decorator.SugarDecorator;

public class CoffeeClient {
    public static void main(String[] args) {

        Coffee myCoffee = new BasicCoffee();
        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee); // extra sugar!

        System.out.println(myCoffee.getDescription()); // Basic Coffee, Milk, Sugar, Sugar
        System.out.println("Total: $" + myCoffee.getCost()); // Total: $2.9
        System.out.println();


        // If you want with Extra Milk

        Coffee coffeeWithExtraMilk=new SugarDecorator(new MilkDecorator(new MilkDecorator(new BasicCoffee())));

        System.out.println(coffeeWithExtraMilk.getDescription());
        System.out.println("Cost of Coffee with Extra Milk is : " + coffeeWithExtraMilk.getCost());
    }
}
