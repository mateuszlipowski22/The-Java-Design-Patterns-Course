package com.udemy.section9.challenge;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
