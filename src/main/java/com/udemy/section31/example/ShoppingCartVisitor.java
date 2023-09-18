package com.udemy.section31.example;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
