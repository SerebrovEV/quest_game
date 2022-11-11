package org.learn.generator;

import org.learn.item.Weapon;

import java.util.Random;

public class WeaponGenerator {

    private final Random random = new Random();
    private final String[] COLOR_WEAPON = new String[]{
            "Абрикосовый",
            "Алый",
            "Блестящий зеленый",
            "Желто-золотой",
            "Зелено-желтый",
            "Зеленый",
            "Кармин",
            "Изумрудный",
            "Коралловый"};
    private final String[] TYPE_OF_MILE_WEAPON = new String[]{
            "Меч",
            "Пика",
            "Кинжал",
            "Нож",
            "Секира",
            "Экскалибур"};

    private final String[] TYPE_OF_MAGIC_WEAPON = new String[]{
            "Посох",
            "Жезл",
            "Фолиант",
            "Шар",
            "Экскалибур"};
    private final String[] NAME_WEAPON = new String[]{
            "Джедая",
            "поглощающая(ий) жизненную энергию",
            "создающая(ий) клоны",
            "Светящийся(аяся)",
            "Поломанный(ая/е)",
            "Грааля"};

    public Weapon generateMileWeapon() {
        return new Weapon(COLOR_WEAPON[random.nextInt(0, COLOR_WEAPON.length)] +
                " " + TYPE_OF_MILE_WEAPON[random.nextInt(0, TYPE_OF_MILE_WEAPON.length)] +
                " " + NAME_WEAPON[random.nextInt(0, NAME_WEAPON.length)],
                random.nextInt(1, 7));
    }

    public Weapon generateMageWeapon() {
        return new Weapon(COLOR_WEAPON[random.nextInt(0, COLOR_WEAPON.length)] +
                " " + TYPE_OF_MAGIC_WEAPON[random.nextInt(0, TYPE_OF_MAGIC_WEAPON.length)] +
                " " + NAME_WEAPON[random.nextInt(0, NAME_WEAPON.length)],
                random.nextInt(1, 7));
    }
}
