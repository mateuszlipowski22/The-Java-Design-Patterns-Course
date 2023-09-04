package com.udemy.section24.challenge;

import java.util.LinkedList;

public class Science implements SubjectInterface{

    private LinkedList<String> subjects;

    public Science() {
        this.subjects = new LinkedList<>();
        subjects.add("Math");
        subjects.add("Comp. Science");
        subjects.add("Physics");
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}
