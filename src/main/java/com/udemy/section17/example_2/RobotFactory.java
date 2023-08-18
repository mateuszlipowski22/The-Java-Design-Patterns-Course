package com.udemy.section17.example_2;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    Map<String, IRobot> robotShapes = new HashMap<>();

    public int totalObjectsCreated() {
        return robotShapes.size();
    }

    public IRobot getRobotFromFactory(String robotType) throws Exception {

        IRobot robot = null;

        if (robotShapes.containsKey(robotType)) {
            robot = robotShapes.get(robotType);
        } else {
            switch (robotType) {
                case "king":
                    System.out.println("We do not have king robot. So we have to create a king robot");
                    robot = new Robot("king");
                    robotShapes.put("king", robot);
                    break;
                case "queen":
                    System.out.println("We do not have queen robot. So we have to create a queen robot");
                    robot = new Robot("queen");
                    robotShapes.put("queen", robot);
                    break;
                default:
                    throw new Exception("Robot factory can create only king and queen robots");
            }
        }
        return robot;
    }
}
