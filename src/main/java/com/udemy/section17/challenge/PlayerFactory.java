package com.udemy.section17.challenge;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    Map<String, Player> players = new HashMap<>();

    public Player getPlayer(String type) {
        Player player = null;
        if (players.containsKey(type)) {
            player = players.get(type);
        } else {
            switch (type) {
                case "terrorist":
                    player=new Terrorist();
                    break;
                case "counter-terrorist":
                    player=new CounterTerrorist();
                    break;
            }
        }
        players.put(type, player);
        return player;
    }

    public int totalObjectsCreated() {
        return players.size();
    }
}
