package com.udemy.section27.example;

public class Client {
    public static void main(String[] args) {

        MyTopic topic = new MyTopic();

        Observer observer1 = new MyTopicSubscriber("Observere 1");
        Observer observer2 = new MyTopicSubscriber("Observere 2");
        Observer observer3 = new MyTopicSubscriber("Observere 3");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();

        topic.postMessage("New message #1");
    }
}
