package org.learn.service;

import org.learn.ability.Skill;
import org.learn.ability.Spell;
import org.learn.model.Hero;
import org.learn.item.Weapon;
import org.learn.model.Mage;
import org.learn.model.Warrior;

import java.util.Scanner;

public class ChangeHero {

    private final Scanner scanner = new Scanner(System.in);
    private final GeneratorForGameplay generatorForGameplay = new GeneratorForGameplay();

    public void levelUp(Hero hero) {
        hero.setHealth(100 + hero.getLevel()*2);
        hero.setLevel(hero.getLevel()+1);
        hero.setDamage(hero.getDamage()+1);
    }
    public void choiceWeapon(Hero hero, Weapon weapon) {
        System.out.println("Поменять оружие " + hero.getWeapon() + " на " + weapon + "? ДА - 1, НЕТ - 0.");
        if (scanner.nextInt() == 1) {
            hero.setWeapon(weapon);
        }
    }
    public void choiceAbility(Mage mage) {
        Spell newSpell = generatorForGameplay.generateSpell();
        System.out.println("Поменять умение " + mage.getSpell() + " на " + newSpell + "? ДА - 1, НЕТ - 0.");
        if (scanner.nextInt() == 1) {
            mage.setSpell(newSpell);
        }
    }
    public void choiceAbility(Warrior warrior) {
        Skill newSkill = generatorForGameplay.generateSkill();
        System.out.println("Поменять умение " + warrior.getSkill() + " на " + newSkill + "? ДА - 1, НЕТ - 0.");
        if (scanner.nextInt() == 1) {
            warrior.setSkill(newSkill);
        }
    }
}
