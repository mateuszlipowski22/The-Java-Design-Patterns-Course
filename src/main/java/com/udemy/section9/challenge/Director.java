package com.udemy.section9.challenge;

public class Director {

    MealBuilder myBuilder;

    public void construct(MealBuilder myBuilder){
        this.myBuilder=myBuilder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }

}
