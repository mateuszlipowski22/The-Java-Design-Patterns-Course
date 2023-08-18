package com.udemy.section17.example;

public class Main {

    public static void main(String[] args) throws Exception {

        RobotFactory robotFactor = new RobotFactory();

        System.out.println("Flyweight Pattern Example");

        Robot robot = robotFactor.getRobotFromFactory("small");
        robot.print();

        for (int i=0; i<3; i++){
            robot=robotFactor.getRobotFromFactory("small");
            robot.print();
        }

        for (int i=0; i<3; i++){
            robot=robotFactor.getRobotFromFactory("large");
            robot.print();
        }
        System.out.println("robotFactor.totalObjectsCreated() = " + robotFactor.totalObjectsCreated());
    }

}
