package com.udemy.section10.prototype;

public class Rectangle extends Shape{

    public Rectangle() {
        this.type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle : draw() method");
    }

}
