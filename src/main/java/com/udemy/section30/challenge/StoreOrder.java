package com.udemy.section30.challenge;

public class StoreOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from the shelf");

    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through cash / POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item taken by customer");
    }
}
