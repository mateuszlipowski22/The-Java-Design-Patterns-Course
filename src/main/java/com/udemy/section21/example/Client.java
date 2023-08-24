package com.udemy.section21.example;

import java.util.Scanner;

public class Client {

    private DispenseChain c1;

    public Client() {
        this.c1 = new Dollar50Dispensor();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        DispenseChain c4 = new Dollar5Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }

    public static void main(String[] args) {

        Client atmDispenser = new Client();

        while(true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);

            amount=input.nextInt();

            if(amount%5!=0){
                System.out.println("Amount should be multiple by 5s");
                return;
            }

            atmDispenser.c1.dispense(new Currency(amount));
        }

    }
}
