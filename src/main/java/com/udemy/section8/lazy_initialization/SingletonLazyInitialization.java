package com.udemy.section8.lazy_initialization;

import java.util.Objects;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization uniqueInstance = null;

    private int data=0;

    private SingletonLazyInitialization() {
    }

    public static SingletonLazyInitialization getInstance(){
        if(Objects.isNull(uniqueInstance)){
            uniqueInstance = new SingletonLazyInitialization();
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
