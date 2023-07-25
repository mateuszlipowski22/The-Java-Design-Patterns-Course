package com.udemy.section7.solution;

public interface MovieFactoryInterface {
    public HollywoodMovieInterface getHollywoodMovie();
    BollywoodMovieInterface getBollywoodMovie();

}

class ActionMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}

class ComedyMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}