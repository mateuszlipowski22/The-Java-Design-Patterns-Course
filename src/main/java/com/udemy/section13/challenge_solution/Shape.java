package com.udemy.section13.challenge_solution;

abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void drawShapes(int border);

    abstract void modifyBorders(int border, int increment);

}
