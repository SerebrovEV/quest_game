package org.learn.model;

public class Monster {

    private String name;
    private static int level = 0;
    private int health;

    private int damage;

    private Weapon loot;

    private Spell spell;

    private String immune;

    public Monster(String name, int health, int damage, Weapon loot, Spell spell, String immune) {
        this.name = name;
        this.health = health + level*10;
        this.damage = damage + level*2;
        this.loot = loot;
        this.spell = spell;
        this.immune = immune;
        this.level = ++level;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon getLoot() {
        return loot;
    }

    public void setLoot(Weapon loot) {
        this.loot = loot;
    }


    public Spell getSpells() {
        return spell;
    }

    public void setSpells(Spell spell) {
        this.spell = spell;
    }

    public String getImmune() {
        return immune;
    }

    public void setImmune(String immune) {
        this.immune = immune;
    }

    @Override
    public String toString() {
        return "Противник: " +
                "Имя = '" + name + '\'' +
                ", Уровень = " + level +
                ", Здоровье = " + health +
                ", Урон = " + damage +
                ", Магия = " + spell;
    }
}
