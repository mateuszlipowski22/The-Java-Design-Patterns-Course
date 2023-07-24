package com.udemy.section7.challenge;

import com.udemy.section7.challenge.domain.BollywoodActionMovie;
import com.udemy.section7.challenge.domain.BollywoodComedyMovie;

public class BollywoodMovieFactory implements MovieFactory{

    @Override
    public Bollywood getMovie(String type) {
        if (type.equalsIgnoreCase("action")){
            return new BollywoodActionMovie();
        }else if(type.equalsIgnoreCase("comedy")){
            return new BollywoodComedyMovie();
        }
        return null;
    }
}
