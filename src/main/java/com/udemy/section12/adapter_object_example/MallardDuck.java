package com.udemy.section12.adapter_object_example;

public class MallardDuck implements Duck{


    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
