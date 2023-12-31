package com.udemy.section23.example;

public class IntToBinaryExpression implements Expression{

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(i);
    }
}
