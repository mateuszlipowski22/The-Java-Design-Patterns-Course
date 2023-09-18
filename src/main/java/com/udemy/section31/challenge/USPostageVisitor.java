package com.udemy.section31.challenge;

public class USPostageVisitor implements Visitor{

    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(book.getPrice()<20){
            totalPostageForCart+= book.getWeight()*2;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice()<20){
            totalPostageForCart+= cd.getWeight()*2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice()<50){
            totalPostageForCart+= dvd.getWeight()*3;
        }
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
