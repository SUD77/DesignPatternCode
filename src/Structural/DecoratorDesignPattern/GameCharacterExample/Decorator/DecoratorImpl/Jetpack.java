package Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.CharacterDecorator;

public class Jetpack extends CharacterDecorator {
    public Jetpack(GameCharacter character) {
        super(character);
    }

    public String describe() {
        return super.describe() + ", flying with a Jetpack (+100 Speed)";
    }
}
