package com.udemy.section21.example;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);

}
