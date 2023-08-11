package com.udemy.section14.challenge;

public class Professor implements Faculty{

    private String name;
    private String position;
    private Long officeNumber;

    public Professor(String name, String position, Long officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public void getDetails() {
        System.out.println(officeNumber+" "+name+" "+position);
    }

}
