package com.udemy.section30.example;

public class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with glass coating");
    }
}
