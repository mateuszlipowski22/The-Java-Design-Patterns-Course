package com.udemy.section10.challenge;

public class Main {

    public static void main(String[] args) {

        BasicCarCache.loadCache();

        BasicCar ford = BasicCarCache.getCar("Ford");
        ford.displayData();
        System.out.println("ford.getClass().getSimpleName() = " + ford.getClass().getSimpleName());

        System.out.println("___________________________________");

        BasicCar nano = BasicCarCache.getCar("Nano");
        nano.displayData();
        System.out.println("nano.getClass().getSimpleName() = " + nano.getClass().getSimpleName());
    }

}
