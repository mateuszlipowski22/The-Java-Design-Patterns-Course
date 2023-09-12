package com.udemy.section28.example;

public class Off extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already Off. Going to be On npw");
        context.setState(new On());
    }
}
