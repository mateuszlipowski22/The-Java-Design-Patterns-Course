package com.udemy.section17.example;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    Map<String, Robot> robotShapes = new HashMap<>();

    public int totalObjectsCreated() {
        return robotShapes.size();
    }

    public Robot getRobotFromFactory(String robotCategory) throws Exception {

        Robot robot = null;

        if (robotShapes.containsKey(robotCategory)) {
            robot = robotShapes.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have small robot. So we have to create a small robot");
                    robot = new SmallRobot();
                    robotShapes.put("small", robot);
                    break;
                case "large":
                    System.out.println("We do not have large robot. So we have to create a large robot");
                    robot = new LargeRobot();
                    robotShapes.put("large", robot);
                    break;
                default:
                    throw new Exception("Robot factory can create only large and small robots");
            }
        }
        return robot;
    }
}
