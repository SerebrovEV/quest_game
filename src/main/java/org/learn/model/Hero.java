package org.learn.model;

import org.learn.ability.Ability;
import org.learn.item.Weapon;
import org.learn.service.HeroAttack;

public abstract class Hero implements HeroAttack {

    private String name;
    private int health = 100;
    private int damage;
    private int level = 1;
    private Weapon weapon;
    private int gold;
    private int roomComplete = 0;

    public Hero(String name, int damage, Weapon weapon) {
        this.name = name;
        this.damage = damage;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getRoomComplete() {
        return roomComplete;
    }

    public void setRoomComplete(int roomComplete) {
        this.roomComplete = roomComplete;
    }

    @Override
    public String toString() {
        return "Игрок = '" + name +
                ", Уровень = " + level +
                ", Здоровье = " + health +
                ", Золота = " + gold +
                ", Пройдено локаций = " + roomComplete +
                ", Оружие = " + getWeapon().getName();
    }
}
