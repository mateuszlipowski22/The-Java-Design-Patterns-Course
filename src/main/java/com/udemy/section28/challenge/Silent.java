package com.udemy.section28.challenge;

public class Silent implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Silent...");
    }
}

