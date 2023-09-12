package com.udemy.section28.example;

public class Client {

    public static void main(String[] args) {

        System.out.println("State - design pattern");

        Off initialState = new Off();

        TV tv = new TV(initialState);

        tv.pressButton();
        tv.pressButton();
        tv.pressButton();
    }

}
