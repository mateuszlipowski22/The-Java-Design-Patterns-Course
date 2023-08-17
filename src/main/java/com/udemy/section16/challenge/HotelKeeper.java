package com.udemy.section16.challenge;

public class HotelKeeper {

    public HotelKeeper() {
    }

    public void getBothMenu(){
        VegNonBothRestaurant vegNonBothRestaurant= new VegNonBothRestaurant();
        vegNonBothRestaurant.getMenus().showMenu();
    }

    public void getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant= new NonVegRestaurant();
        nonVegRestaurant.getMenus().showMenu();
    }

    public void getVegMenu(){
        VegRestaurant vegRestaurant= new VegRestaurant();
        vegRestaurant.getMenus().showMenu();
    }

}
