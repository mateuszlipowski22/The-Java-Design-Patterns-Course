package com.udemy.section12.adapter_calculator;

public class Calculator implements CalculatorInterface{

    Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle=rectangle;
        return this.rectangle.getLength()*this.rectangle.getWidth();
    }
}
