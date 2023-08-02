package com.udemy.section9.challenge;

public class VegMealBuilder implements MealBuilder{

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {

        vegMeal.addItem(new VegBurger());

    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());

    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
