package Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.CharacterDecorator;

public class Sword extends CharacterDecorator {

    public Sword(GameCharacter character) {
        super(character);
    }

    public String describe() {
        return super.describe() + ", wielding a Sword (+10 Attack)";
    }
}
