package org.learn.model;

import org.learn.ability.Skill;
import org.learn.item.Weapon;
import org.learn.service.HeroAttack;

public class Warrior extends Hero implements HeroAttack {
    private Skill skill;

    public Warrior(String name, int damage, Weapon weapon, Skill skill) {
        super(name, damage, weapon);
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }


    @Override
    public void heroAttackMessage() {
        System.out.println("Воин наносит удар " + skill.getName());
    }

    @Override
    public int heroDamage() {
        return getDamage() + getWeapon().getDamage() + skill.getDamage();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Умение = " + getSkill().getName() +
                ", Урон = " + heroDamage();
    }
}
