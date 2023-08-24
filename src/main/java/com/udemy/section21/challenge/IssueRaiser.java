package com.udemy.section21.challenge;

public class IssueRaiser {

    private Receiver firstReceiver;


    public IssueRaiser(Receiver receiver) {
        this.firstReceiver = receiver;
    }

    public void raiseMessage(Message message){
        if(message!=null){
            firstReceiver.processMassage(message);
        }
    }
}
