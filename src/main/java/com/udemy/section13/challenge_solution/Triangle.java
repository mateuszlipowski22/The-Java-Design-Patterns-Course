package com.udemy.section13.challenge_solution;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void drawShapes(int border) {
        System.out.println("This Triangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorders(int border, int increment) {
        System.out.println("Now we are changing the border length "+increment +" times");
        border=border*increment;
        drawShapes(border);
    }
}
