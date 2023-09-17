package com.udemy.section30.challenge;

public class NetOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preferences");
        System.out.println("Get delivery address");

    }

    @Override
    public void doPayment() {
        System.out.println("Online Payment through netbanking, card, paypal");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through post office to delivery address");
    }
}
