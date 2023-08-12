package com.udemy.section13.challenge;

public class Triangle extends Shape{

    public Triangle(Color color, int border) {
        super(color, border);
    }

    @Override
    void drawShapes() {
        System.out.println("This Triangle colored with: "+color.fillWithColor(border));
    }
}
