package com.udemy.section17.example_2;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        RobotFactory robotFactor = new RobotFactory();

        System.out.println("Flyweight Pattern Example");

        IRobot robot = robotFactor.getRobotFromFactory("king");
        robot.setColor(getRandomColor());
        robot.print();

        for (int i=0; i<5; i++){
            robot = robotFactor.getRobotFromFactory("king");
            robot.setColor(getRandomColor());
            robot.print();
        }

        for (int i=0; i<5; i++){
            robot = robotFactor.getRobotFromFactory("queen");
            robot.setColor(getRandomColor());
            robot.print();
        }
        System.out.println("robotFactor.totalObjectsCreated() = " + robotFactor.totalObjectsCreated());
    }

    public static String getRandomColor(){
        Random r = new Random();
        int random = r.nextInt(20);

        if(random%2==0){
            return "green";
        }else {
            return "red";
        }
    }
}
