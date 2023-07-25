package com.udemy.section7.solution;

public class Client {

    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("Action");

        HollywoodMovieInterface hAction = actionMovies.getHollywoodMovie();
        BollywoodMovieInterface bAction = actionMovies.getBollywoodMovie();

        System.out.println("Action movies");
        System.out.println("hAction.getMovieName() = " + hAction.getMovieName());
        System.out.println("bAction.getMovieName() = " + bAction.getMovieName());


        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("Comedy");

        HollywoodMovieInterface hComedy = comedyMovies.getHollywoodMovie();
        BollywoodMovieInterface bComedy = comedyMovies.getBollywoodMovie();

        System.out.println("Comedy movies");
        System.out.println("hComedy.getMovieName() = " + hComedy.getMovieName());
        System.out.println("bComedy.getMovieName() = " + bComedy.getMovieName());
    }

}
