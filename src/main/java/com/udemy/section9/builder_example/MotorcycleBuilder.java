package com.udemy.section9.builder_example;

public class MotorcycleBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("Two wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("One headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
