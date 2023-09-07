package com.udemy.section25.challenge;

public class Client {

    public static void main(String[] args) {

        AuctionMediator mediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(mediator, "Mateusz");
        Buyer b2 = new AuctionBuyer(mediator, "Beata");
        Buyer b3 = new AuctionBuyer(mediator, "Antoś");
        Buyer b4 = new AuctionBuyer(mediator, "Rozalia");

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);
        mediator.addBuyer(b4);

        System.out.println("Welcome to the auction");
        System.out.println("----------------------");
        System.out.println("Waiting for the buyer offers");

        b1.bid(1000);
        b2.bid(300);
        b3.bid(3000);
        b4.bid(2000);

        mediator.findHighestBidder();
        System.out.println("----------------------");
        System.out.println(b3.getName() + " has cancelled the offer");

        b3.cancelTheBid();
        System.out.println("----------------------");

        mediator.findHighestBidder();

    }

}
