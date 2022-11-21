package org.learn.ability;

public class Spell extends Ability {

    public Spell(String name, int damage) {
        super(name, damage);
    }

    @Override
    public String toString() {
        return "Заклинание = " + getName() +
                ", Урон = " + getDamage();
    }
}
