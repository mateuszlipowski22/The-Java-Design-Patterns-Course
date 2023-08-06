package com.udemy.section10.challenge;

import java.util.HashMap;
import java.util.Map;

public class BasicCarCache {

    private static Map<String, BasicCar> basicCars = new HashMap();

    public static BasicCar getCar(String carModel) {
        BasicCar cachedCar = basicCars.get(carModel);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCache(){
        Ford ford = new Ford();
        basicCars.put(ford.getModel(), ford);

        Nano nano = new Nano();
        basicCars.put(nano.getModel(), nano);
    }

}
