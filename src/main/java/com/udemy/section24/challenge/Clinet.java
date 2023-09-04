package com.udemy.section24.challenge;

public class Clinet {

    public static void main(String[] args) {
        System.out.println("---- Iterator Pattern ----");
        SubjectInterface art = new Arts();
        SubjectInterface science = new Science();


        IteratorInterface artIterator = art.createIterator();
        IteratorInterface scienceIterator = science.createIterator();

        print(artIterator);
        print(scienceIterator);


    }

    public static void print(IteratorInterface iteratorInterface){
        while (!iteratorInterface.isDone()){
            System.out.println(iteratorInterface.next());
        }
    }
}
