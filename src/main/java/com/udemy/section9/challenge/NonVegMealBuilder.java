package com.udemy.section9.challenge;

public class NonVegMealBuilder implements MealBuilder{

    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());

    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());

    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
