package com.workintech.monster;

public class Werewolf extends Monster implements Bleedable{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return 0.25 * getDamage();
    }

}
