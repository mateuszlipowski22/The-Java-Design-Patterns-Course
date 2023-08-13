package com.udemy.section15.decorator_example;

public class ConcreteDecoratorEx2 extends AbstractDecorator{

    @Override
    public void doJob() {
        System.out.println("Start Example 2");
        super.doJob();
        System.out.println("I am explicitly  from example 2");
        System.out.println("End Example 2");

    }
}
