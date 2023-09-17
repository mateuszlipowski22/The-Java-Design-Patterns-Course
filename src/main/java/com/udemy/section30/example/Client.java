package com.udemy.section30.example;

public class Client {
    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();

        System.out.println("_______________________");

        houseTemplate=new GlassHouse();
        houseTemplate.buildHouse();
    }
}
