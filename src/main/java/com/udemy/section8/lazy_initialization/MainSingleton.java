package com.udemy.section8.lazy_initialization;

public class MainSingleton {

    public static void main(String[] args) {


        SingletonLazyInitialization singleton = SingletonLazyInitialization.getInstance();
        singleton.setData(10);
        System.out.println("singleton.getData() = " + singleton.getData());
        System.out.println("singleton = " + singleton);

        System.out.println("____________________________");

        SingletonLazyInitialization anotherSingleton = SingletonLazyInitialization.getInstance();
        System.out.println("anotherSingleton.getData() = " + anotherSingleton.getData());
        System.out.println("anotherSingleton = " + anotherSingleton);


    }

}
