package com.udemy.section18.example;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Load from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Loading "+fileName);
    }
}
