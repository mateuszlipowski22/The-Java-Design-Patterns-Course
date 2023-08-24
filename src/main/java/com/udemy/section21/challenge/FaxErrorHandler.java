package com.udemy.section21.challenge;

public class FaxErrorHandler implements Receiver{
    private Receiver nextChain;

    @Override
    public void setNextChain(Receiver nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public boolean processMassage(Message message) {
        if(message.getText().contains("fax")){
            System.out.println("FaxErrorHandler processed " + message.getPriority()+" priority");
            return true;
        }else {
            if(nextChain!=null){
                nextChain.processMassage(message);
            }
        }
        return false;
    }
}
