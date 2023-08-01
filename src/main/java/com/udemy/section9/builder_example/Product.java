package com.udemy.section9.builder_example;

import java.util.LinkedList;

public class Product {

    LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part){
        parts.addLast(part);
    }

    public void show(){
        parts.forEach(System.out::println);
    }
}
