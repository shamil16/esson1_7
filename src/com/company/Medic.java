package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("hill");
    }
    int healPoints;
    public String increaseExperience(){
        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " увеличелся на 10% стало: " + tenPercent;
    }
}
