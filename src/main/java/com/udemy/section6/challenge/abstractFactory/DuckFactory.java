package com.udemy.section6.challenge.abstractFactory;

import com.udemy.section6.challenge.Animal;
import com.udemy.section6.challenge.Duck;

public class DuckFactory extends AbstractFactory{
    @Override
    protected Animal factoryMethod() {
        return new Duck();
    }
}
