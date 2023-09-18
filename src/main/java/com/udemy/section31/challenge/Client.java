package com.udemy.section31.challenge;

import java.util.ArrayList;

public class Client {

    public static ArrayList<Visitable> items = new ArrayList<>();

    public static double calculatePostage(Visitor visitor){
        for(Visitable item : items){
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }

    public static void main(String[] args) {

        Visitable book = new Book(122,42);
        Visitable cd = new CD(23,42);
        Visitable dvd = new DVD(32,52);

        items.add(book);
        items.add(cd);
        items.add(dvd);

        Visitor visitor = new USPostageVisitor();
        double usPostage = calculatePostage(visitor);
        System.out.println("US postage = "+usPostage);

        visitor = new SouthAmericaPostageVisitor();
        double southAmericaPostage = calculatePostage(visitor);

        System.out.println("South America postage = "+southAmericaPostage);
    }
}
