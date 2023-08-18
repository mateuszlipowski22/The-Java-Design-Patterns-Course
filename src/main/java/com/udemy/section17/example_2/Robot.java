package com.udemy.section17.example_2;

public class Robot implements IRobot {

    public String robotType;
    public String color;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void print() {
        System.out.println("This is a "+robotType+" type robot with "+ color);
    }
}
