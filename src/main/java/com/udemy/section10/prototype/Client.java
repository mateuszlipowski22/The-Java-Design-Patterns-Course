package com.udemy.section10.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape.getType());
    }

}
