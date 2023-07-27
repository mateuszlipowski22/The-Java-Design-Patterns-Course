package com.udemy.section8.double_checked_locking;


import java.util.Objects;

public class SingletonDoubleChecked {

    private volatile static SingletonDoubleChecked uniqueInstance = null;

    private int data = 0;

    private SingletonDoubleChecked() {
    }

    public static SingletonDoubleChecked getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            synchronized (SingletonDoubleChecked.class) {
                if (Objects.isNull(uniqueInstance)) {
                    uniqueInstance = new SingletonDoubleChecked();
                }
            }
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
