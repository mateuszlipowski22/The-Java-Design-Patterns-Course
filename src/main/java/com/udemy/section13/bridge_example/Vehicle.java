package com.udemy.section13.bridge_example;

abstract class Vehicle {

    protected Workshop workshop1;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract void manufacture();
}
