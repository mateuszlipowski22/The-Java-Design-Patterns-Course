package com.udemy.section7.challenge;

public class BaseMovie {
    public void getMovieName() {
        System.out.println("Inside of "+ this.getClass().getSimpleName() + " class");
    }
}
