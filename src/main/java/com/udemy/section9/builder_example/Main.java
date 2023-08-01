package com.udemy.section9.builder_example;

public class Main {

    public static void main(String[] args) {

        System.out.println("___________________");

        Director director = new Director();

        Builder carBuilder=new CarBuilder();
        Builder motorBuilder=new MotorcycleBuilder();

        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        System.out.println("___________________");

        director.construct(motorBuilder);
        Product motor = motorBuilder.getVehicle();
        motor.show();
    }

}
