package Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.CharacterDecorator;

public class MagicShield extends CharacterDecorator {

    public MagicShield(GameCharacter character) {
        super(character);
    }

    public String describe() {
        return super.describe() + ", protected by a Magic Shield (+20 Defense)";
    }
}
