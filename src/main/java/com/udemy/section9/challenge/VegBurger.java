package com.udemy.section9.challenge;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 25.0f;
    }
}
