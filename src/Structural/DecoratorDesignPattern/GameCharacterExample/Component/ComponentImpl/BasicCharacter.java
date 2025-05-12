package Structural.DecoratorDesignPattern.GameCharacterExample.Component.ComponentImpl;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;

public class BasicCharacter implements GameCharacter {
    @Override
    public String describe() {
        return "Adventurer with no gear";
    }
}
