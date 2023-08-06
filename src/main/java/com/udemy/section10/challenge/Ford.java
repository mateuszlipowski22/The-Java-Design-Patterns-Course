package com.udemy.section10.challenge;

public class Ford extends BasicCar implements Cloneable{

    public Ford() {
        super("Ford");
        this.setPrice(10000);
    }

    @Override
    public Ford clone() {
        return (Ford) super.clone();
    }
}
