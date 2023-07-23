package com.udemy.section6.challenge;

import com.udemy.section6.challenge.abstractFactory.DuckFactory;
import com.udemy.section6.challenge.abstractFactory.TigerFactory;
import com.udemy.section6.challenge.concreteFactory.AnimalFactory;
import com.udemy.section6.challenge.staticFactory.StaticAnimalFactory;

public class Client {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal duck = animalFactory.getAnimalType("duck");
        Animal tiger = animalFactory.getAnimalType("tiger");
        duck.eat();
        tiger.eat();

        System.out.println("---------------------------------");
        Animal tiger1 = new TigerFactory().getAnimal();
        Animal duck1 = new DuckFactory().getAnimal();
        duck1.eat();
        tiger1.eat();

        System.out.println("---------------------------------");

        Animal duck2 = StaticAnimalFactory.getAnimalType("duck");
        Animal tiger2 = StaticAnimalFactory.getAnimalType("tiger");
        duck2.eat();
        tiger2.eat();
    }

}
