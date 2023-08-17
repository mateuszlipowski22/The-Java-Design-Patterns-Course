package com.udemy.section16.challenge;

public class HotelKeeper {

    public HotelKeeper() {
    }

    public Both getBothMenu(){
        VegNonBothRestaurant vegNonBothRestaurant= new VegNonBothRestaurant();
        Both both = (Both) vegNonBothRestaurant.getMenus();
        return both;
    }

    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant= new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegRestaurant.getMenus();
        return nonVegMenu;
    }

    public VegMenu getVegMenu(){
        VegRestaurant vegRestaurant= new VegRestaurant();
        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenus();
        return vegMenu;
    }

}
