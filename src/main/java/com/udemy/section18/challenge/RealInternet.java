package com.udemy.section18.challenge;

public class RealInternet implements Internet{

    @Override
    public void connect(String website) {
        System.out.println("Connecting to "+ website);
    }
}
