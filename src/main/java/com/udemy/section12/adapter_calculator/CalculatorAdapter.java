package com.udemy.section12.adapter_calculator;

public class CalculatorAdapter implements CalculatorInterface{

    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator=new Calculator();

        Rectangle r= new Rectangle(triangle.getBase(), 0.5*triangle.getHeight());

        return calculator.getArea(r);
    }
}
