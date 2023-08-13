package com.udemy.section15.decorator_example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Decorator Design Pattern");
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.doJob();
        System.out.println("_______________________________________");

        ConcreteDecoratorEx1 concreteDecoratorEx1 = new ConcreteDecoratorEx1();

        concreteDecoratorEx1.setComponent(concreteComponent);
        concreteDecoratorEx1.doJob();

        System.out.println("_______________________________________");

        ConcreteDecoratorEx2 concreteDecoratorEx2 = new ConcreteDecoratorEx2();
        concreteDecoratorEx2.setComponent(concreteDecoratorEx1);
        concreteDecoratorEx2.doJob();

    }
}
