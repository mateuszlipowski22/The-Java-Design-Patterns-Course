package com.udemy.section15.challenge;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape greenCircleDecorator = new GreedShapeDecorator(circle);
        System.out.println("\nCircle with green border");
        greenCircleDecorator.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nCircle with red border");
        redRectangle.draw();
    }

}
