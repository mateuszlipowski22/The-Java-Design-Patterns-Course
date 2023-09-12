package com.udemy.section28.challenge;

public class Vibration implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Vibration...");
    }
}
