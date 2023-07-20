package com.udemy.section6.FactoryAbstractCreatorExample;

public class Client {

    public static void main(String[] args) {

        Shape circle = new CircleFactory().getShape();
        circle.draw();

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();

        Shape square = new SquareFactory().getShape();
        square.draw();
    }

}
