package com.udemy.section8.bill_pugh;

public class SingletonBillPugh {


    private int data=0;

    private SingletonBillPugh() {
    }

    public static SingletonBillPugh getInstance(){

        return SingletonHelper.uniqueInstance;

    }

    private static class SingletonHelper{
        private static final SingletonBillPugh uniqueInstance = new SingletonBillPugh();

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
