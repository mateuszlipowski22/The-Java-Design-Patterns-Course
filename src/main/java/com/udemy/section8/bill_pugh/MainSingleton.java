package com.udemy.section8.bill_pugh;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonBillPugh singleton = SingletonBillPugh.getInstance();
        singleton.setData(10);
        System.out.println("singleton.getData() = " + singleton.getData());
        System.out.println("singleton = " + singleton);

        System.out.println("____________________________");

        SingletonBillPugh anotherSingleton = SingletonBillPugh.getInstance();
        System.out.println("anotherSingleton.getData() = " + anotherSingleton.getData());
        System.out.println("anotherSingleton = " + anotherSingleton);
    }
}
