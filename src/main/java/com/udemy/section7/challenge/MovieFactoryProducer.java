package com.udemy.section7.challenge;

public class MovieFactoryProducer {
    public static MovieFactory getMovieFactory(String choice){
        if (choice.equalsIgnoreCase("Hollywood")){
            return new HollywoodMovieFactory();
        }else if(choice.equalsIgnoreCase("Bollywood")){
            return new BollywoodMovieFactory();
        }
        return null;
    }
}
