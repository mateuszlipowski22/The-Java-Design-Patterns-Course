package com.udemy.section25.challenge;

public class AuctionBuyer extends Buyer{

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        setPrice(price);
    }

    @Override
    public void cancelTheBid() {
        setPrice(-1);
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Recived massage that the auction is over: "+getName());
    }
}
