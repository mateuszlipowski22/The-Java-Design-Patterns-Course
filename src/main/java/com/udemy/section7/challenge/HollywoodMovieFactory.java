package com.udemy.section7.challenge;

import com.udemy.section7.challenge.domain.HollywoodActionMovie;
import com.udemy.section7.challenge.domain.HollywoodComedyMovie;

public class HollywoodMovieFactory implements MovieFactory{

    @Override
    public Hollywood getMovie(String type) {
        if (type.equalsIgnoreCase("action")){
            return new HollywoodActionMovie();
        }else if(type.equalsIgnoreCase("comedy")){
            return new HollywoodComedyMovie();
        }
        return null;
    }
}
