package com.udemy.section7.abstractFactoryMethod;

public class FactoryProducer {

    public static AbstractFacotry getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
