package com.udemy.section17.challenge;

public class Terrorist extends Player{
    public Terrorist() {
        super("to plant the bomb");
    }

    @Override
    public void presentPlayer() {
        System.out.println("I am a terrorist with "+getWeapon());
    }
}
