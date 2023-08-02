package com.udemy.section9.challenge;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 10.0f;
    }
}
