package com.workintech.monster;

public class Werewolf extends Monster{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return 0.25 * getDamage();
    }

    @Override
    public double poison() {
        return 0.3 * getDamage();
    }
}
