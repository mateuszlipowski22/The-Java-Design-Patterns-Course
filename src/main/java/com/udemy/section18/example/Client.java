package com.udemy.section18.example;

public class Client {

    public static void main(String[] args) {

        Image image = new ProxyImage("someFile.jpg");

        image.display();
        System.out.println("-----");
        image.display();

    }

}
