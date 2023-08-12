package com.udemy.section13.challenge;

public class Rectangle extends Shape{

    public Rectangle(Color color, int border) {
        super(color, border);
    }

    @Override
    void drawShapes() {
        System.out.println("This Rectangle colored with: "+color.fillWithColor(border));
    }
}
