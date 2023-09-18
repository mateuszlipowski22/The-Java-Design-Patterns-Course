package com.udemy.section31.challenge;

public interface Visitor {
    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

    double getTotalPostage();
}
