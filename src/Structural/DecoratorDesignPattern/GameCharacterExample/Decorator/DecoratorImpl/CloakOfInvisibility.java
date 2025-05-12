package Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.CharacterDecorator;

public class CloakOfInvisibility extends CharacterDecorator {
    public CloakOfInvisibility(GameCharacter character) {
        super(character);
    }

    public String describe() {
        return super.describe() + ", wearing a Cloak of Invisibility (+50 Stealth)";
    }
}
