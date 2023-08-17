package com.udemy.section16.challenge;

public class HotelKeeper {

    private NonVegRestaurant nonVegRestaurant;
    private VegRestaurant vegRestaurant;
    private VegNonBothRestaurant vegNonBothRestaurant;

    public HotelKeeper() {
        this.nonVegRestaurant = new NonVegRestaurant();
        this.vegRestaurant = new VegRestaurant();
        this.vegNonBothRestaurant = new VegNonBothRestaurant();
    }

    public void getBothMenu(){
        vegNonBothRestaurant.getMenus().showMenu();
    }

    public void getNonVegMenu(){
        nonVegRestaurant.getMenus().showMenu();
    }

    public void getVegMenu(){
        vegRestaurant.getMenus().showMenu();
    }

}
