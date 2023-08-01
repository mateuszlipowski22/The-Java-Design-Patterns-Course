package com.udemy.section9.builder_example;

public class CarBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("Four wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("Two headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
