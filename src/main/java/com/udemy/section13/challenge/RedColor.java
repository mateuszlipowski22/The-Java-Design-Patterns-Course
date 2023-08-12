package com.udemy.section13.challenge;

public class RedColor implements Color{
    @Override
    public String fillWithColor(int border) {
        return "Red color with "+border + " inch border";
    }
}
