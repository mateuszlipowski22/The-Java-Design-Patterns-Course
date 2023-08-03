package com.udemy.section10.prototype;

public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square : draw() method");
    }

}
