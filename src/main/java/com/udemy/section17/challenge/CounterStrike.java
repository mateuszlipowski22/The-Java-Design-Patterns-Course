package com.udemy.section17.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CounterStrike {

    public static List<String> weaponList = new ArrayList<>(
            List.of("AK-47",
                    "MP-5",
                    "Glock",
                    "Bowie Knife",
                    "USP (Universal Self-Loading Pistol) .45ACP Tactical",
                    "9x19mm sidearm",
                    "KM.45 Tactical",
                    "228 compact",
                    "Night Hawk .50c",
                    "ES Five-Seven",
                    ".40 Dual Elites",
                    "Schmidt Machine Pistol",
                    "Ingram MAC 10",
                    "H&K MP5",
                    "H&K UMP45",
                    "FN P90")
    );

    public static void main(String[] args) {

        PlayerFactory playerFactory = new PlayerFactory();

        System.out.println("Flyweight Pattern Challenge");

        Player player;

        for (int i = 0; i < 10; i++) {
            player = playerFactory.getPlayer("terrorist");
            player.assignWeapon(getRandomWeapon());
            player.presentPlayer();
        }

        for (int i = 0; i < 10; i++) {
            player = playerFactory.getPlayer("counter-terrorist");
            player.assignWeapon(getRandomWeapon());
            player.presentPlayer();
        }
        System.out.println("Total players created = " + playerFactory.totalObjectsCreated());

    }

    public static String getRandomWeapon() {
        Random r = new Random();
        int random = r.nextInt(weaponList.size());

        return weaponList.get(random);
    }
}
