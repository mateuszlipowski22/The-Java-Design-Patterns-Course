package com.udemy.section29.example;

public class Item {
    private String upc;
    private int price;

    public Item(String upc, int price) {
        this.upc = upc;
        this.price = price;
    }

    public String getUpc() {
        return upc;
    }

    public int getPrice() {
        return price;
    }
}
