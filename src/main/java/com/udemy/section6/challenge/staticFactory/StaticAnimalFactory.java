package com.udemy.section6.challenge.staticFactory;

import com.udemy.section6.challenge.Animal;
import com.udemy.section6.challenge.Duck;
import com.udemy.section6.challenge.Tiger;

public class StaticAnimalFactory {

    public static Animal getAnimalType(String animal){

        if(animal.equalsIgnoreCase("DUCK")){
            return new Duck();
        }else if(animal.equalsIgnoreCase("TIGER")){
            return new Tiger();
        }
        return null;
    }

}
