package com.udemy.section17.challenge;

public class CounterTerrorist extends Player{
    public CounterTerrorist() {
        super("to refuse the bomb");
    }

    @Override
    public void presentPlayer() {
        System.out.println("I am a counter-terrorist with "+getWeapon());
    }
}
