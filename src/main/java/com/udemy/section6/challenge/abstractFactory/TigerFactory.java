package com.udemy.section6.challenge.abstractFactory;

import com.udemy.section6.challenge.Animal;
import com.udemy.section6.challenge.Tiger;

public class TigerFactory extends AbstractFactory {
    @Override
    protected Animal factoryMethod() {
        return new Tiger();
    }
}
