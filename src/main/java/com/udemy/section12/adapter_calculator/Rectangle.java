package com.udemy.section12.adapter_calculator;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
