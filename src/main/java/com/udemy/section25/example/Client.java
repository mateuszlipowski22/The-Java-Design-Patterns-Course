package com.udemy.section25.example;

public class Client {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Mateusz");
        User user2 = new UserImpl(mediator, "Beata");
        User user3 = new UserImpl(mediator, "Antek");
        User user4 = new UserImpl(mediator, "Rozalka");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }


}
