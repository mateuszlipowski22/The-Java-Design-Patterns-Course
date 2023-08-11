package com.udemy.section14.challenge;

public class Main {

    public static void main(String[] args) {


        Supervisor dean = new Supervisor("Dean", "Technical department");

        Supervisor csHead = new Supervisor("CS professor", "Computer Science departement");
        Supervisor mathHead = new Supervisor("Mathematics professor", "Math departement");

        Professor mathFaculty1 = new Professor("Adam", "Adept", 101L);
        Professor mathFaculty2 = new Professor("Michael", "Adept", 102L);

        Professor csFaculty1 = new Professor("Thomas", "Adept", 201L);
        Professor csFaculty2 = new Professor("Nicola", "Adept", 202L);
        Professor csFaculty3 = new Professor("Hessus", "Adept", 203L);


        dean.addFaculty(csHead);
        dean.addFaculty(mathHead);

        csHead.addFaculty(csFaculty1);
        csHead.addFaculty(csFaculty2);
        csHead.addFaculty(csFaculty3);

        mathHead.addFaculty(mathFaculty1);
        mathHead.addFaculty(mathFaculty2);

        dean.getDetails();

    }
}
