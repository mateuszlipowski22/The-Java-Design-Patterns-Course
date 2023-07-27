package com.udemy.section8.eagar_initialization;

public class SingletonEagarInitialization {

    private static SingletonEagarInitialization uniqueInstance = new SingletonEagarInitialization();

    private int data=0;

    private SingletonEagarInitialization() {
    }

    public static SingletonEagarInitialization getInstance(){
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
