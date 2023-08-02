package com.udemy.section9.challenge;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return 50.0f;
    }
}
