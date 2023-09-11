package com.udemy.section27.challenge;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
