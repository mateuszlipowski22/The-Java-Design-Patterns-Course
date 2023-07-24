package com.udemy.section7.abstractFactoryMethod;


public abstract class AbstractFacotry {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}


class ShapeFactory extends AbstractFacotry {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType==null){
            return null;
        }else if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        return null;
    }
}

class ColorFactory extends AbstractFacotry {

    @Override
    Color getColor(String color) {
        if(color==null){
            return null;
        }else if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("Blue")){
            return new Blue();
        }else if (color.equalsIgnoreCase("Green")){
            return new Green();
        }

        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}