package com.udemy.section8.double_checked_locking;

public class MainSingleton {

    public static void main(String[] args) {


        SingletonDoubleChecked singleton = SingletonDoubleChecked.getInstance();
        singleton.setData(10);
        System.out.println("singleton.getData() = " + singleton.getData());
        System.out.println("singleton = " + singleton);

        System.out.println("____________________________");

        SingletonDoubleChecked anotherSingleton = SingletonDoubleChecked.getInstance();
        System.out.println("anotherSingleton.getData() = " + anotherSingleton.getData());
        System.out.println("anotherSingleton = " + anotherSingleton);


    }

}
