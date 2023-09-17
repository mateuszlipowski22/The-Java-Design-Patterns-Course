package com.udemy.section29.example;

public class PaypalStrategy implements PaymentStrategy{
    private String email_id;
    private String password;

    public PaypalStrategy(String email_id, String password) {
        this.email_id = email_id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using PayPal.");
    }
}
