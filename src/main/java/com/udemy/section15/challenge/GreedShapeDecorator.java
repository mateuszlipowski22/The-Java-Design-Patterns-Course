package com.udemy.section15.challenge;

public class GreedShapeDecorator extends ShapeDecorator{

    public GreedShapeDecorator(Shape shape) {
        this.shape=shape;
    }

    @Override
    public void draw() {
        if(shape!=null){
            shape.draw();
            System.out.println("Color: Green");
        }
    }
}
