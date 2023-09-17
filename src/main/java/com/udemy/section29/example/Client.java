package com.udemy.section29.example;

public class Client {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234",   10);
        Item item2 = new Item("5678",   40);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("abc@wp.pl", "1234"));

        shoppingCart.pay(new CreditCardStrategy("mateusz", "12342341233", "444", "12/23"));

    }

}
