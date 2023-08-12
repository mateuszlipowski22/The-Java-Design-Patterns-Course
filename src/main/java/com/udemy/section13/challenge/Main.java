package com.udemy.section13.challenge;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(new RedColor(), 10);
        System.out.println("Drawing Triangle:");
        triangle.drawShapes();
        triangle.modifyBorders(2);
        triangle.drawShapes();

        Rectangle rectangle = new Rectangle(new GreenColor(), 20);
        System.out.println("Drawing Rectangle:");
        rectangle.drawShapes();
        rectangle.modifyBorders(3);
        rectangle.drawShapes();

    }

}
