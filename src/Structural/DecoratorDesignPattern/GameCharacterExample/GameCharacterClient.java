package Structural.DecoratorDesignPattern.GameCharacterExample;

import Structural.DecoratorDesignPattern.GameCharacterExample.Component.ComponentImpl.BasicCharacter;
import Structural.DecoratorDesignPattern.GameCharacterExample.Component.GameCharacter;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl.CloakOfInvisibility;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl.Jetpack;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl.MagicShield;
import Structural.DecoratorDesignPattern.GameCharacterExample.Decorator.DecoratorImpl.Sword;

public class GameCharacterClient {
    public static void main(String[] args) {

        GameCharacter hero = new BasicCharacter();

        // Equip the hero with a sword and cloak
        hero = new Sword(hero);
        hero = new CloakOfInvisibility(hero);
        hero = new MagicShield(hero);
        hero = new Jetpack(hero);

        System.out.println(hero.describe());
        System.out.println();

        //Uncomment and then check the code below
        // You can create other characters as per your need as:

      /*
        // 🧝 1. Stealthy Elf - Only wears a cloak
        GameCharacter stealthElf = new CloakOfInvisibility(new BasicCharacter());
        System.out.println("Stealth Elf: " + stealthElf.describe());

        // 🧙 2. Battle Mage - Sword + Shield
        GameCharacter battleMage = new MagicShield(new Sword(new BasicCharacter()));
        System.out.println("Battle Mage: " + battleMage.describe());

        // 🛸 3. Rocket Goblin - Jetpack only
        GameCharacter rocketGoblin = new Jetpack(new BasicCharacter());
        System.out.println("Rocket Goblin: " + rocketGoblin.describe());

        // ⚔️🛡️🕵️ 4. Full Armor Knight - Sword + Shield + Cloak
        GameCharacter fullKnight = new CloakOfInvisibility(
                new MagicShield(
                        new Sword(new BasicCharacter())));
        System.out.println("Full Armor Knight: " + fullKnight.describe());

        // 👑 5. The Ultimate Hero - All gear equipped
        GameCharacter ultimateHero = new Jetpack(
                new MagicShield(
                        new CloakOfInvisibility(
                                new Sword(new BasicCharacter()))));
        System.out.println("Ultimate Hero: " + ultimateHero.describe());

        // 🦄 6. Weird Combo - Jetpack before cloak (bad idea?)
        GameCharacter flyingGhost = new CloakOfInvisibility(
                new Jetpack(new BasicCharacter()));
        System.out.println("Flying Ghost: " + flyingGhost.describe());

       */
    }
}
