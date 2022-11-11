package org.learn.ability;

public class Skill extends Ability {

    public Skill(String name, int damage) {
        super(name, damage);
    }
    @Override
    public String toString() {
        return "Умение = " + getName() +
                ", Урон = " + getDamage();
    }

}
