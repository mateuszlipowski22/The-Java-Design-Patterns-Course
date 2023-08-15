package com.udemy.section15.challenge_solution;

public class GreedShapeDecorator extends ShapeDecorator {

    public GreedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setGreenBorder(shape);
    }

    private void setGreenBorder(Shape shape){
        System.out.println("Border Color: Green");
    }
}
