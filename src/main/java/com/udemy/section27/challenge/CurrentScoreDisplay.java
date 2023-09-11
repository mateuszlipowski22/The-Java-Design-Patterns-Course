package com.udemy.section27.challenge;

public class CurrentScoreDisplay implements Observer{

    int runs;
    int wickets;
    float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.println("Average score Display: ");
        System.out.println("Runs: "+runs);
        System.out.println("Wickets: "+wickets);
        System.out.println("Overs: "+overs);
    }
}
