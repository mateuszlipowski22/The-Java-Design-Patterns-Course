package com.udemy.section24.example;

public class NotificationCollection implements Collection{
    static final int MAX_ITEMS = 6 ;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        this.notificationList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String notificaation) {
        Notification notification = new Notification(notificaation);

        if(numberOfItems>=MAX_ITEMS){
            System.err.println("Full");
        }else {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }

}
