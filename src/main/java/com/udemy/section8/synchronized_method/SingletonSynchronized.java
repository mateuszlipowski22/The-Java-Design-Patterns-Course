package com.udemy.section8.synchronized_method;

import java.util.Objects;

public class SingletonSynchronized {

    private static SingletonSynchronized uniqueInstance = null;

    private int data=0;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance(){
        if(Objects.isNull(uniqueInstance)){
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
