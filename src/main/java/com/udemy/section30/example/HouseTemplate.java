package com.udemy.section30.example;

public abstract class HouseTemplate {

    public final void  buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    private void buildWindows() {
        System.out.println("Build Glass Windows");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Build foundation with cement, steel rods and sand");
    }

}
