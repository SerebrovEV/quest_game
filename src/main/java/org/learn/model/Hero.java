package org.learn.model;

public class Hero {

    private String name;
    private int health = 100;
    private int damage;
    private int level = 1;
    private Weapon weapon;

    private Spell spell;

    public Hero(String name, Spell spell) {
        this.name = name;
        this.spell = spell;
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



    @Override
    public String toString() {
        return "Игрок: " +
                "Имя = '" + name + '\'' +
                ", Уровень = " + level +
                ", Здоровье = " + health +
                ", Урон = " + damage +
                ", Оружие = " + weapon +
                ", Магия = " + spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
