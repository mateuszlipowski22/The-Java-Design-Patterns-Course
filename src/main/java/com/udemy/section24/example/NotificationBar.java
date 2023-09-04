package com.udemy.section24.example;

public class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications(){
        Iterator iterator = notifications.createIterator();
        System.out.println("----------Notification bar----------");
        while(iterator.hasNext()){
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
