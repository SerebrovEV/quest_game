package org.learn.service;

import org.learn.model.Monster;
import org.learn.model.Hero;

import java.security.BasicPermission;
import java.util.Random;
import java.util.Scanner;

public class Battle {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public Hero battle(Hero hero, Monster monster) {

        boolean bothAreAlive = true;

        while (bothAreAlive) {
            if (random.nextBoolean()) {
                attackPlayer(hero, monster);
                attackMonster(hero, monster);
            } else {
                attackMonster(hero, monster);
                attackPlayer(hero, monster);
            }
            if (hero.getHealth() <= 0 || monster.getHealth() <= 0) {
                bothAreAlive = false;
            }
        }
        if (hero.getHealth() <= 0) {
            System.out.println("Игрок проиграл! Остаток здоровье монстра " + monster.getHealth());
            return null;
        } else {
            System.out.println("Монстр проиграл! Остаток здоровье игрока " + hero.getHealth() + ". Выпал лут " + monster.getLoot());
            return hero;
        }
    }

    private int attackDamage(int damage) {
        if (random.nextInt(0, 101) > 90) {
            damage = damage / 2;
            System.out.println("Блокировка!!");
        } else if (random.nextInt(0, 101) > 80) {
            damage = damage * 2;
            System.out.println("Критический урон!!!");
        } else if (random.nextInt(0, 101) > 90) {
            damage = 0;
            System.out.println("Уклонение!!!");
        }
        return damage;
    }

    private void attackMonster(Hero hero, Monster monster) {
        int monsterDamage;
        if (random.nextInt(0, 101) > 80) {
            monsterDamage = attackDamage(monster.getSpells().getDamage());
        } else {
            monsterDamage = attackDamage(monster.getDamage());
        }
        hero.setHealth(hero.getHealth() - monsterDamage);

        System.out.println("Монстр нанес " + monsterDamage + " урон(a). Остаток здоровье игрока " + hero.getHealth());
        System.out.println();
    }

    private void attackPlayer(Hero hero, Monster monster) {
        int playerDamage;
        System.out.println("Использовать магию?");
        if (scanner.nextInt() == 1) {
            playerDamage = attackDamage(hero.getSpell().getDamage());
        } else {
            playerDamage = attackDamage(hero.getDamage() + hero.getWeapon().getDamage());
        }
        monster.setHealth(monster.getHealth() - playerDamage);

        System.out.println("Игрок нанес " + playerDamage + " урон(а). Остаток здоровье монстра " + monster.getHealth());
        System.out.println();
    }

    private boolean magicalResistance(Hero hero, Monster monster) {
        return !hero.getSpell().getElementType().equals(monster.getImmune());
    }

}
