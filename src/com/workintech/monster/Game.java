package com.workintech.monster;

public class Game {
    public static void main(String[] args) {
        Monster werewolf = new Werewolf("Lupin", 20, 10);
        System.out.println(werewolf.attack());
    }
}
