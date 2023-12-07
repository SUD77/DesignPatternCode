package Structural.BridgeDesignPattern.BridgePatternExample1.Abstractions;

import Structural.BridgeDesignPattern.BridgePatternExample1.Implementation.Pizza;

public abstract class Restaurant {

    //this is the bridge bw abstraction and implementation
    protected Pizza pizza;

    protected Restaurant(Pizza pizza){
        this.pizza=pizza;
    }

    abstract void resType();

    public void deliver(){
        resType();
        pizza.pizzaType();
    }



}
