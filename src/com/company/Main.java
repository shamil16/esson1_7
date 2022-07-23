package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        magic.applySuperAbility();
        Medic medic = new Medic();
        medic.increaseExperience();
        Warrior warrior = new Warrior();
        warrior.applySuperAbility();
        warrior.health = 105;
        magic.health = 100;
        magic.health = 110;
        Hero[] hero1 = {magic, medic, warrior};
        for (int i = 0; i < hero1.length; i++) {
            System.out.println(medic.increaseExperience() + "  " +i);
        }
    }
}

