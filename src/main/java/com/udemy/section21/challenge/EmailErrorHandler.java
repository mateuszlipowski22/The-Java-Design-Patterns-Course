package com.udemy.section21.challenge;

public class EmailErrorHandler implements Receiver{
    private Receiver nextChain;

    @Override
    public void setNextChain(Receiver nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public boolean processMassage(Message message) {
        if(message.getText().contains("email")){
            System.out.println("EmailErrorHandler processed " + message.getPriority()+" priority");
            return true;
        }else {
            if(nextChain!=null){
                nextChain.processMassage(message);
            }
        }
        return false;
    }
}
