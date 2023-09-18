package com.udemy.section31.example;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public int visit(Book book) {
        int cost = 0;
        if(book.getPrice()>50){
            cost = book.getPrice()-5;
        }else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN: "+book.getIsbnNumber() + " cost "+ cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getWeight()* fruit.getPricePerKg();
        System.out.println(fruit.getName() + " cost "+ cost);
        return cost;
    }
}
