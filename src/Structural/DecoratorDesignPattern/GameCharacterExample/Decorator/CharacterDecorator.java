package Structural.DecoratorDesignPattern.GameCharacterExample.Decorator;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;

public abstract class CharacterDecorator implements GameCharacter {

    protected GameCharacter character;

    public CharacterDecorator(GameCharacter character) {
        this.character = character;
    }

    @Override
    public String describe() {
        return character.describe();
    }
}
