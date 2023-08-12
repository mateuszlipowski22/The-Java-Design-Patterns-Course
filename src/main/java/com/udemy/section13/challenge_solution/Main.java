package com.udemy.section13.challenge_solution;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------");
        Color RedColor = new RedColor();
        Triangle triangle = new Triangle(RedColor);
        System.out.println("Drawing Triangle:");
        triangle.drawShapes(10);
        triangle.modifyBorders(10, 3);

        System.out.println("-------------------");
        Color GreenColor = new GreenColor();
        Rectangle rectangle = new Rectangle(GreenColor);
        System.out.println("Drawing Rectangle:");
        rectangle.drawShapes(10);
        rectangle.modifyBorders(10, 2);
    }
}
