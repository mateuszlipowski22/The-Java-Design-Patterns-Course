package com.udemy.section15.decorator_example;

public class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("I am from concrete component - I am close for modification.");
    }
}
