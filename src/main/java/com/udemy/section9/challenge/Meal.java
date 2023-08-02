package com.udemy.section9.challenge;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items;

    public Meal(){
        items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (int i = 0; i < items.size(); i++) {
            cost+=items.get(i).getPrice();
        }
        return cost;
    }

    public void showItems(){

        items.forEach(item -> {
            System.out.println("Item : "+ item.name() + " Packing : "+ item.packing().pack()+" Price : "+ item.getPrice());
        });

    }

}
