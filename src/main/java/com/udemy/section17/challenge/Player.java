package com.udemy.section17.challenge;

public abstract class Player {
    public Player(String task) {
        this.task = task;
    }

    private String task;
    private String weapon;

    public void assignWeapon(String weapon){
        this.weapon=weapon;
    }

    public void mission(){
        System.out.println("My task is: "+task);
    }

    public String getWeapon() {
        return weapon;
    }

    public abstract void presentPlayer();
}
