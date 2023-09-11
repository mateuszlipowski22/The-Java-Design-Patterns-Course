package com.udemy.section27.example;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);
}
