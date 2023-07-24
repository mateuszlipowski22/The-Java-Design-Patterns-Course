package com.udemy.section7.abstractFactoryMethod;

public class Client {

    public static void main(String[] args) {

        AbstractFacotry shapeFactory = FactoryProducer.getFactory("shape");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();

        AbstractFacotry colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("Red");
        red.fill();
        Color green = colorFactory.getColor("Green");
        green.fill();
        Color blue = colorFactory.getColor("Blue");
        blue.fill();
    }

}
