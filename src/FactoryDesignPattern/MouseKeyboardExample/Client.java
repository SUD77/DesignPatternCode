package FactoryDesignPattern.MouseKeyboardExample;


/*
* Problem Statement :
* Client wants to choose between 2 types of mouses to buy/get from.
* Apple Mouse or Microsoft Mouse.
* Implement this feature using Factory Design Pattern.
*
*
* */
public class Client {

    public static void main(String[] args) {

        String mouseType="AppleMouse";

        Mouse mouse=Factory.getMouse(mouseType);
        mouse.createMouse();
    }

}
