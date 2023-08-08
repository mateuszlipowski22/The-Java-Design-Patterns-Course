package com.udemy.section12.adapter_calculator;

public class Main {

    public static void main(String[] args) {


        System.out.println("Adapter");
        Triangle triangle = new Triangle(20, 20);

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(triangle);

        System.out.println("Area of triangle is "+ calculatorAdapter.getArea(null));


    }

}
