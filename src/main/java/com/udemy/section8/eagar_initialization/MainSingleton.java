package com.udemy.section8.eagar_initialization;

public class MainSingleton {
    public static void main(String[] args) {

        SingletonEagarInitialization singleton = SingletonEagarInitialization.getInstance();
        singleton.setData(10);
        System.out.println("singleton.getData() = " + singleton.getData());
        System.out.println("singleton = " + singleton);

        System.out.println("____________________________");

        SingletonEagarInitialization anotherSingleton = SingletonEagarInitialization.getInstance();
        System.out.println("anotherSingleton.getData() = " + anotherSingleton.getData());
        System.out.println("anotherSingleton = " + anotherSingleton);

    }
}
