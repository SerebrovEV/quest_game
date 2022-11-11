package org.learn.service;

import org.learn.model.Hero;
import org.learn.model.Weapon;

import java.util.Scanner;

public class LevelUpPlayer {

    private static final Scanner scanner = new Scanner(System.in);

    public Hero levelUp(Hero hero, Weapon weapon) {
        hero.setHealth(100 + hero.getLevel()*2);
        hero.setLevel(hero.getLevel()+1);
        System.out.println("Поменять оружие " + hero.getWeapon() + " на " + weapon + "? ДА - 1, НЕТ - 0.");
        if (scanner.nextInt() == 1) {
            hero.setWeapon(weapon);
        }
        hero.setDamage(hero.getDamage()+1);
        return hero;
    }
}
