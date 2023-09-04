package com.udemy.section24.challenge;

import java.util.LinkedList;

public class ScienceIterator implements IteratorInterface {
    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects=subjects;
        position=0;
    }

    @Override
    public void first() {
        position=0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public Boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}
