package com.udemy.section21.example;

public class Dollar5Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 5) {
            int num = currency.getAmount() / 5;
            int remainder = currency.getAmount() % 5;

            System.out.println("Dispensing " + num + " 5$ note");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
