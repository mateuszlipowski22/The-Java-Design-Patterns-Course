package com.udemy.section6.challenge.abstractFactory;

import com.udemy.section6.challenge.Animal;

public abstract class AbstractFactory {

   protected abstract Animal factoryMethod();

   public Animal getAnimal(){
       return factoryMethod();
   }

}
