package com.udemy.section9.challenge;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 12.0f;
    }
}
