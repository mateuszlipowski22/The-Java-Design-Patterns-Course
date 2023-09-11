package com.udemy.section27.challenge;

public class AverageScoreDisplay implements Observer{

    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {

        this.runRate=(float) runs/overs;
        this.predictedScore=(int) (this.runRate*50);
        
        display();
    }

    private void display() {
        System.out.println("Average score Display: ");
        System.out.println("Run rate: "+runRate);
        System.out.println("Predicted score: "+predictedScore);
    }
}


