package com.udemy.section9.builder_example;

public interface Builder {

    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();

}
