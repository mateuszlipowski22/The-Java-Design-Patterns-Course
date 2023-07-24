package com.udemy.section7.challenge;

import com.udemy.section7.challenge.domain.Movie;

public interface MovieFactory {
    Movie getMovie(String type);
}
