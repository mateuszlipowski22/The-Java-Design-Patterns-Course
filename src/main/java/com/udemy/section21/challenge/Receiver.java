package com.udemy.section21.challenge;

public interface Receiver {

    void setNextChain(Receiver nextChain);

    public boolean processMassage(Message message);
}
