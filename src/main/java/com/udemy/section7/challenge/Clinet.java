package com.udemy.section7.challenge;

import com.udemy.section7.challenge.domain.Movie;

public class Clinet {

    public static void main(String[] args) {

        MovieFactory bollywoodMovieFactory = MovieFactoryProducer.getMovieFactory("bollywood");
        MovieFactory hollywoodMovieFactory = MovieFactoryProducer.getMovieFactory("hollywood");

        Movie bollywoodActionMovie = bollywoodMovieFactory.getMovie("Action");
        bollywoodActionMovie.getMovieName();

        Movie bollywoodComedyMovie = bollywoodMovieFactory.getMovie("Comedy");
        bollywoodComedyMovie.getMovieName();

        Movie hollywoodActionMovie = hollywoodMovieFactory.getMovie("action");
        hollywoodActionMovie.getMovieName();

        Movie hollywoodComedyMovie = hollywoodMovieFactory.getMovie("comedy");
        hollywoodComedyMovie.getMovieName();
    }

}
