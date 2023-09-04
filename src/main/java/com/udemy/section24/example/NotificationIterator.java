package com.udemy.section24.example;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList=notificationList;
    }


    @Override
    public boolean hasNext() {
        return !((pos>= notificationList.length) || (notificationList[pos]==null));
    }

    @Override
    public Object next() {
        Notification notification = notificationList[pos];
        pos++;
        return notification;
    }
}
