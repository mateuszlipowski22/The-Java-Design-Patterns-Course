package com.udemy.section27.challenge;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject{
    private List<Observer> observers;
    int runs;
    int wickets;
    float overs;

    public CricketData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer==null){
            throw new NullPointerException("Null Observer");
        }

        if(!observers.contains(observer)){
            observers.add(observer );
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(runs, wickets, overs);
        }
    }

    public int getLastRuns() {
        return 90;
    }

    public int getLastWickets() {
        return 2;
    }

    public float getLastOvers() {
        return 10.2f;
    }

    public void dataChanged(){
        runs=getLastRuns();
        wickets=getLastWickets();
        overs=getLastOvers();
        notifyObservers();
    }

}
