package com.udemy.section25.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User userSending) {
        users.stream().filter(user -> user!=userSending).forEach(user->user.receive(message));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
