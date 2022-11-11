package org.learn.model;

import org.learn.ability.Spell;
import org.learn.item.Weapon;
import org.learn.service.HeroAttack;

public class Mage extends Hero implements HeroAttack {

    private Spell spell;

    public Mage(String name, int damage, Weapon weapon, Spell spell) {
        super(name, damage, weapon);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public void heroAttackMessage() {
        System.out.println("Маг произносит заклинание " + spell.getName());
    }

    @Override
    public int heroDamage() {
        return getDamage() + getWeapon().getDamage() + spell.getDamage();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Заклинание = " + getSpell().getName() +
                ", Урон = " + heroDamage();
    }
}
