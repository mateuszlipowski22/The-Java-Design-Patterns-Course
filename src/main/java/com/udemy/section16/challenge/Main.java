package com.udemy.section16.challenge;

public class Main {

    public static void main(String[] args) {

        HotelKeeper hotelKeeper = new HotelKeeper();
        System.out.println();

        Both both = hotelKeeper.getBothMenu();
        VegMenu vegMenu = hotelKeeper.getVegMenu();
        NonVegMenu nonVegMenu = hotelKeeper.getNonVegMenu();
        System.out.println();

        both.showMenu();
        vegMenu.showMenu();
        nonVegMenu.showMenu();

    }

}
