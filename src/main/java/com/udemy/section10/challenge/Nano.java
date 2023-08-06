package com.udemy.section10.challenge;

public class Nano extends BasicCar implements Cloneable{

    public Nano() {
        super("Nano");
        this.setPrice(12000);
    }

    @Override
    public Nano clone() {
        return (Nano) super.clone();
    }
}
