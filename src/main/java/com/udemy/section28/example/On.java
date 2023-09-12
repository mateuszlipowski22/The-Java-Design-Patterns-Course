package com.udemy.section28.example;

public class On extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be off npw");
        context.setState(new Off());
    }
}
