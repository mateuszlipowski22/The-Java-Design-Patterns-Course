package com.udemy.section8.synchronized_method;


public class MainSingleton {

    public static void main(String[] args) {

        SingletonSynchronized singleton = SingletonSynchronized.getInstance();
        singleton.setData(10);
        System.out.println("singleton.getData() = " + singleton.getData());
        System.out.println("singleton = " + singleton);

        System.out.println("____________________________");

        SingletonSynchronized anotherSingleton = SingletonSynchronized.getInstance();
        System.out.println("anotherSingleton.getData() = " + anotherSingleton.getData());
        System.out.println("anotherSingleton = " + anotherSingleton);


    }

}
