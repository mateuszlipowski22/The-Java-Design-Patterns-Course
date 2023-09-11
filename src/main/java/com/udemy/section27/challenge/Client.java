package com.udemy.section27.challenge;

public class Client {
    public static void main(String[] args) {

        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        CricketData cricketData = new CricketData();

        cricketData.register(averageScoreDisplay);
        cricketData.register(currentScoreDisplay);
        cricketData.dataChanged();

        cricketData.unregister(currentScoreDisplay);
        cricketData.dataChanged();
    }
}
