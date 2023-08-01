package com.udemy.section9.builder_example;

public class Director {

    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.buildBody();
        builder.addHeadLights();
        builder.insertWheels();
    }


}
