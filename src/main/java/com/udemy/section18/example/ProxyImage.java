package com.udemy.section18.example;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(this.fileName);
        }
        realImage.display();
    }
}
