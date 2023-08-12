package com.udemy.section13.challenge;

public class GreenColor implements Color{
    @Override
    public String fillWithColor(int border) {
        return "Green color with "+border + " inch border";
    }
}
