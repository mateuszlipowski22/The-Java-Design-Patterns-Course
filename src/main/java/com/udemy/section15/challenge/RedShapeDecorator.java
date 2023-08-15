package com.udemy.section15.challenge;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        this.shape=shape;
    }

    @Override
    public void draw() {
        if(shape!=null){
            shape.draw();
            System.out.println("Color: Red");
        }
    }
}
