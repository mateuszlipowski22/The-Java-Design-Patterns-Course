package com.udemy.section27.example;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
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
        List<Observer> observersLocal = null;

        if(!changed){
            return;
        }

        observersLocal=new ArrayList<>(this.observers);
        this.changed=false;

        for (Observer observer : observersLocal) {
            observer.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to topic: "+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
