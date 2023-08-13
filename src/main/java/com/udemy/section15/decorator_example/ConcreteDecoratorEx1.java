package com.udemy.section15.decorator_example;

public class ConcreteDecoratorEx1 extends AbstractDecorator{

    @Override
    public void doJob() {
        System.out.println("Start Example 1");
        super.doJob();
        System.out.println("I am explicitly  from example 1");
        System.out.println("End Example 1");
    }
}
