package com.udemy.section9.challenge;

public class Main {

    public static void main(String[] args) {

        System.out.println("Builder Pattern");

        Director director = new Director();
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        director.construct(nonVegMealBuilder);

        Meal vegMeal = vegMealBuilder.getMeal();
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        vegMeal.showItems();
        System.out.println("vegMeal.getCost() = " + vegMeal.getCost());

        System.out.println("_______________________");

        nonVegMeal.showItems();
        System.out.println("nonVegMeal.getCost() = " + nonVegMeal.getCost());
    }

}
