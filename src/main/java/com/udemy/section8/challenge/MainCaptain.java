package com.udemy.section8.challenge;

public class MainCaptain {

    public static void main(String[] args) {

        System.out.println("Creation of first captain");
        Captain captainC1 = Captain.getInstance();
        System.out.println("captainC1 = " + captainC1);

        Captain captainC2 = Captain.getInstance();
        System.out.println("captainC2 = " + captainC2);

        if(captainC1==captainC2){
            System.out.println("Captains are the same");
        }
    }

}
