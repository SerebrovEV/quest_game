package org.learn.service;

import com.github.javafaker.Faker;
import org.learn.model.Hero;
import org.learn.model.Monster;
import org.learn.model.Spell;
import org.learn.model.Weapon;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneratorForGameplay {
    private final Faker faker = new Faker();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public Hero generatePlayer() {
        System.out.println("Введите имя героя:");
        String playerName = scanner.nextLine();
        System.out.println("Имя персонажа: " + playerName);
        Hero hero = new Hero(playerName, generateSpell());
        hero.setDamage(faker.random().nextInt(5, 11));
        hero.setWeapon(new Weapon("Руки", 0));
        return hero;
    }

    public Monster generateMonster() {
        Monster monster = new Monster(faker.witcher().monster(),
                faker.random().nextInt(20, 101),
                faker.random().nextInt(5, 11),
                generateWeapon(),
                generateSpell(),
                LIST_OF_ELEMENTS.get(random.nextInt(0, 4)));
        System.out.println(monster);
        return monster;
    }

    private final String[] TYPE_OF_WEAPON = new String[4];

    public Weapon generateWeapon() {
        TYPE_OF_WEAPON[0] = "Меч";
        TYPE_OF_WEAPON[1] = "Лук";
        TYPE_OF_WEAPON[2] = "Пика";
        TYPE_OF_WEAPON[3] = "Арбалет";
        String color = faker.color().name();
        return new Weapon(TYPE_OF_WEAPON[random.nextInt(0, 4)] + " " + color,
                random.nextInt(1, 5));
    }

    private enum Elements {
        FIRE("Fire"),
        WATER("Water"),
        GROUND("Ground");
        private final String element;

        Elements(String element) {
            this.element = element;
        }
    }

    private final List<String> LIST_OF_ELEMENTS = List.of("Fire", "Water", "Ground", "Air");

    public Spell generateSpell() {
        return new Spell(faker.harryPotter().spell(),
                random.nextInt(10, 16),
                LIST_OF_ELEMENTS.get(random.nextInt(0, 4)));
    }

}

