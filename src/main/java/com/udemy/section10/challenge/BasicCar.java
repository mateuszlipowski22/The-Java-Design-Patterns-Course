package com.udemy.section10.challenge;

public abstract class BasicCar implements Cloneable{

    public BasicCar(String model) {
        this.model = model;
        this.price = 1000;
    }

    private final String model;

    private float price;

    @Override
    public BasicCar clone() {
        try {
            BasicCar clone = (BasicCar) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void displayData(){
        System.out.println("____________________________________");
        System.out.println("This car model is: "+ getModel());
        System.out.println("This car price is: "+ getPrice());
        System.out.println("____________________________________");
    }
}
