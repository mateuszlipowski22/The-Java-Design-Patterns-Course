package com.udemy.section25.challenge;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{

    private final List<Buyer> buyers;

    public AuctionMediator() {
        this.buyers = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName()+" was added to the buyer list");
    }

    @Override
    public void findHighestBidder() {

        int maxBid=0;
        Buyer winner = null;

        for (Buyer buyer : buyers) {
            if(buyer.getPrice()>maxBid){
                maxBid=buyer.getPrice();
                winner=buyer;
            }
        }
        System.out.println("The auction winner is "+winner.getName()+" with price of "+ winner.getPrice());

        buyers.forEach(Buyer::auctionHasEnded);
    }
}
