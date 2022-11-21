package org.learn.service;

import com.github.javafaker.Faker;
import org.learn.ability.Skill;
import org.learn.ability.Spell;
import org.learn.generator.WeaponGenerator;
import org.learn.item.Weapon;
import org.learn.model.*;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneratorForGameplay {
    private final Faker faker = new Faker();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private final WeaponGenerator weaponGenerator = new WeaponGenerator();
    private final Weapon defaultWeapon = new Weapon("Руки", 1);
    private final Skill defaultSkill = new Skill("Удар простой", 1);
    private final Spell defaultSpell = new Spell("Fire Blast", 1);

    public Hero generatePlayer() {
        System.out.println("Введите имя героя:");
        String playerName = scanner.nextLine();
        System.out.println("Имя персонажа: " + playerName);
        System.out.println("Выберете клас персонажа:");
        System.out.println("Маг - 1, Воин - 2.");
        int checkTypeHero = scanner.nextInt();
        if (checkTypeHero == 1) {
            return generateMage(playerName);
        } else {
            return generateWarrior(playerName);
        }

    }

    private Mage generateMage(String playerName) {
        return new Mage(playerName,
                5,
                defaultWeapon,
                defaultSpell);
    }

    private Warrior generateWarrior(String playerName) {
        return new Warrior(playerName,
                10,
                defaultWeapon,
                defaultSkill);
    }


    private Monster generateMonster(Hero hero) {
        Weapon weapon;
        if (hero.getClass() == Mage.class) {
            weapon = weaponGenerator.generateMageWeapon();
        } else {
            weapon = weaponGenerator.generateMileWeapon();
        }
        Monster monster = new Monster(faker.witcher().monster(),
                faker.random().nextInt(50, 101),
                faker.random().nextInt(5, 11),
                weapon,
                generateSpell());
        System.out.println(monster);
        return monster;
    }

    public Room generateRoom(Hero hero) {
        Room room = new Room(faker.twinPeaks().location(),
                random.nextInt(1, 11));
        if (random.nextBoolean()) {
            room.setMonster(generateMonster(hero));
        }
        System.out.println(room);
        return room;
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
                random.nextInt(5, 11));
    }

    public Skill generateSkill() {
        return new Skill(faker.superhero().power(),
                random.nextInt(5, 11));
    }

}

