package com.udemy.section18.challenge;

public class Client {

    public static void main(String[] args) {

        Internet proxyInternet = new ProxyInternet();

        proxyInternet.connect("interia.pl");
        System.out.println("----------");
        proxyInternet.connect("wp.pl");

    }

}
