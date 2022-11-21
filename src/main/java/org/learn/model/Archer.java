package org.learn.model;

import org.learn.item.Weapon;
import org.learn.service.HeroAttack;

public class Archer extends Hero implements HeroAttack {

    public Archer(String name, int damage, Weapon weapon) {
        super(name, damage, weapon);
    }

    @Override
    public void heroAttackMessage() {

    }

    @Override
    public int heroDamage() {
        return 0;
    }
}
